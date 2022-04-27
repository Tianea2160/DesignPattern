package singleton;


import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static org.assertj.core.api.Assertions.assertThat;

/*
하나의 클래스 인스턴스만 만들고 그 인스턴스를 전역접근하여서 자원의 절약하는 패턴
객체지향 원칙에는 어긋나는 패턴이지만 프로젝트에 하나만 존재해야하고 필요하지 않을 때는 lazy 하게 생성할 수 있도록 도와주는
양날의 검과 같은 패턴이다.

자바 리플렉션을 사용하면 여러개의 싱글톤 클래스를 호출할 수 있기는 하지만 일반적인 상황에서 그런 현상은 일어나지 않는다.
 */


class TraditionalSingletonTest {

    @Test
    void 고전_싱글톤_패턴을_사용해보자() throws Exception {
        TraditionalSingleton singleton = TraditionalSingleton.getInstance();
        TraditionalSingleton copy = TraditionalSingleton.getInstance();
        assertThat(singleton).isEqualTo(copy);
    }

    @Test
    void 멀티_스레드를_사용하는_상황에서도_잘_작동하는_싱글톤을_사용하자() throws Exception {
        ExecutorService es = Executors.newCachedThreadPool();

        for(int i = 0; i<100; i++){
            es.submit(() -> {//Double-checked locking
                System.out.println(System.identityHashCode(Singleton.getInstance()));
            });
        }
        System.out.println("===========");
        for(int i = 0; i<100; i++){
            es.submit(() -> {
                System.out.println(System.identityHashCode(TraditionalSingleton.getInstance()));
            });
        }

        /*
        TraditionalSingleton 으로 불러온 인스턴스는 아래에 보이는 것과 같이 다른 객체가 생성되는 것을 볼 수 있다. 이는 싱글톤 패턴이면서
        여러개의 객체가 생성된 것이다.
         */
        /*
        663205859
        663205859
        662104194
        662104194
        662104194
         */

        EnumSingleton enumSingleton = EnumSingleton.UNIQUE_INSTANCE;
        //이렇게 사용하는 것도 하나의 방법이다.
        //enum 클래스는 완벽한 싱글톤 패턴의 구현이기도 하다.
    }
}
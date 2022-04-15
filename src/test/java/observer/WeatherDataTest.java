package observer;

import observer.display.FirstDisplay;
import observer.display.SecondDisplay;
import observer.display.ThirdDisplay;
import org.junit.jupiter.api.Test;

/*
옵저버 패턴에 대한 요약
옵저버 패턴은 subject - observer 관계로 구분이 되고 subject의 상태가 바뀌면 observer에 알림을 보내서 observer의 상태를
변화 시킬 수 있다. 주체가 관찰자에 알리는 방식으로 구현이 되고 각각의 객체는 역할에 맞는 인터페이스를 구현하는 것으로 서로의 상태를 알지 못해도
연결되어 있을 수 있다.(느슨한 결합0


왜/언제 사용해야하는가?
 - 여러 객체가 하나의 주체로 부터 정보를 얻어야할 때 사용한다.
 - 정보가 최신의 일관성 있는 상태로 요구될 때 사용한다.
 - 서로 연결은 되어 있어야하지만 느슨한 결합이 요구될 때 사용한다.
 */


class WeatherDataTest {
    @Test
    void 관찰자패턴이_성공적으로_구현이되었는지_확인하고_출력확인() throws Exception {
        //given
        WeatherData weatherData = new WeatherData();
        FirstDisplay firstDisplay = new FirstDisplay(weatherData);
        SecondDisplay secondDisplay = new SecondDisplay(weatherData);
        ThirdDisplay thirdDisplay = new ThirdDisplay(weatherData);

        //when
        weatherData.update(10, 20, 30);
        weatherData.update(20, 40, 60);

        weatherData.removeObservers(firstDisplay);
        weatherData.update(1,2,3);
    }

    @Test
    void 람다표현식을_이용한_옵저버_생성() throws Exception{
        //given
        WeatherData weatherData  = new WeatherData();
        weatherData.registerObservers((a,b,c)->{
            System.out.println("나는 람다 표현식1입니다.");
        });
        weatherData.registerObservers((a,b,c)->{
            System.out.println("나는 람다 표현식2입니다.");
        });
        weatherData.registerObservers((a,b,c)->{
            System.out.println("나는 람다 표현식3입니다.");
        });
        //when

        weatherData.update(0,0,0);
        //then
    }
}
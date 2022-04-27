package singleton;

public class TraditionalSingleton {
    private static TraditionalSingleton instance;

    private TraditionalSingleton(){this.name = "traditional singleton";}

    public static TraditionalSingleton getInstance(){
        // 병렬로 싱글톤이 동시에 생성되면 여러 인스턴스가 생길 수도 있다는 취약점이 존재함
        if(instance == null){
            instance = new TraditionalSingleton();
        }
        return instance;
    }

    private String name;

    public String getName() {
        return name;
    }
}

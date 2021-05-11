package sandbox;

import java.util.UUID;

public class HejHej {
    private MyClass myClass;

    public HejHej(MyClass myClass) {
        this.myClass = myClass;
    }

    public void logic() {
        System.out.println(myClass.new InnerTest() {

            @Override
            public String logic() {
                return UUID.randomUUID().toString();
            }
        }.logic());
    }

}

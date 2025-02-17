package design.patterns.creational.singleton;

public class Demo {
    public static void main(String[] args) {
        Model model1 = Model.getInstance();
        Model model2 = Model.getInstance();
        System.out.println(model1 == model2);

        Model2 mode2A = SingletonBean.getInstance(Model2.class, Model2::getInstance);
        Model2 mode2B = SingletonBean.getInstance(Model2.class, Model2::getInstance);
        System.out.println(mode2A == mode2B);
    }
}

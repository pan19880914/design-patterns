package 装饰器模式.有;

public abstract class 灌饼装饰器 implements 灌饼 {

    private 灌饼 灌饼;

    public 灌饼装饰器(灌饼 灌饼){
        this.灌饼 = 灌饼;
    }

    public String 名称() {
        return this.灌饼.名称();
    }

    public int 价格() {
        return this.灌饼.价格();
    }
}

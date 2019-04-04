package 装饰器模式.有;

public class 加香肠装饰器 extends 灌饼装饰器 {
    public 加香肠装饰器(装饰器模式.有.灌饼 灌饼) {
        super(灌饼);
    }
    @Override
    public String 名称(){
        return super.名称() + " 加一个香肠";
    }
    @Override
    public int 价格(){
        return super.价格() + 3;
    }
}

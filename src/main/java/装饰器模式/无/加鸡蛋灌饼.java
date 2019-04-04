package 装饰器模式.无;

public class 加鸡蛋灌饼 extends 鸡蛋灌饼 {
    @Override
    public String 名称(){
        return super.名称() + " 加一个鸡蛋";
    }
    @Override
    public int 价格(){
        return super.价格() + 2;
    }
}

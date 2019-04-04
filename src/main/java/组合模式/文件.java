package 组合模式;

import java.util.Objects;

/**
 * <p>
 * 文件
 * </p>
 *
 * @author Administrator
 * @version 1.0
 * @since 2019-04-04 17:19
 **/
public abstract class 文件 {

    private String 文件名称;

    public 文件(String 文件名称) {
        this.文件名称 = 文件名称;
    }

    public String get文件名称() {
        return 文件名称;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        文件 文件 = (文件) o;
        return Objects.equals(文件名称, 文件.文件名称);
    }

    @Override
    public int hashCode() {
        return Objects.hash(文件名称);
    }

    public abstract void lock(int n);

    protected String 生成空格(int n){
        StringBuffer sb = new StringBuffer();
        while (n > 0){
            sb.append(" ");
            n--;
        }
        return sb.toString();
    }
}

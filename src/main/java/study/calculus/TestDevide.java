package study.calculus;

public class TestDevide {
    public static void main(String[] args) {
        System.out.println(1f/15f);

        float[] fs=new float[25];

        fs[0]=0.01f;
        for(int i=0;i<(fs.length-1);i++){
            fs[i+1]=fs[i]*(2f-(15f*fs[i]));
            System.out.println("第"+i+"项逼近1/15："+fs[i+1]);
        }
    }
}

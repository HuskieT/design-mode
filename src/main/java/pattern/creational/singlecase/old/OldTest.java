package pattern.creational.singlecase.old;

import static pattern.creational.singlecase.old.Single1.single1;

/**
 * @Author linfei
 * @Date 2019/3/27 16:05
 * @Description
 */
public class OldTest {
    public static void main(String[] args) throws InterruptedException {

       single1.show();
       Single2.single2.show();
       Single3.getInstance().show();
       Single4.SingleInstanc.getInstance().show();


//        Thread thread1 = new Thread(new ThreadOne());
//        Thread thread2 = new Thread(new ThreadTwo());
//        thread1.start();
//        thread2.start();




            int a []={123,34,322313,3243,32,5,7,7};
            for(int i=0;i<a.length;i++){
                for(int j=i;j<a.length;j++){
                    if(a[i]<a[j]){
                        int swap=a[i];
                        a[i]=a[j];
                        a[j]=swap;
                    }
                }
            }

            System.out.println(a);






    }
}

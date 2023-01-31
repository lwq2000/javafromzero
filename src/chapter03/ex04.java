package chapter03;

public class ex04 {
    public static void main(String[] args){
        /*
        & && | || ! ^
         */
        boolean x = true;
        boolean y = false;
        short z = 46;
        if ((z++==46) && (y=true)){//47
            z++;//48
        }
        if ((x=false) || (++z==49)){//49
            z++;//50
        }
        System.out.println("z=" + z);//50
        byte b = 2;
        b += 2;
    }
}

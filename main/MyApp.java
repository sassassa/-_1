package main;

/**
 * Write a description of class MyApp here.
 *
 * @author (2017210105 김민수)
 * @version (2020.09.16)
 */
public class MyApp
{
    public static void main(String[] args)
    {
        Integer[] array;
        String data = "2,3,5,2,3,10";
        array = makeToken(data);
        Circle c1 = makeCircle(array[0], array[1], array[2]);
        Circle c2 = makeCircle(array[3], array[4], array[5]);
        
        System.out.println("원1 : " +c1 + " ==> 면적 : " + c1.getArea());
        System.out.println("원2 : " +c2 + " ==> 면적 : " + c2.getArea());
        if(c1 == c2)
            System.out.println("같은 원");
        else
            System.out.println("서로 다른 원");
    }
}
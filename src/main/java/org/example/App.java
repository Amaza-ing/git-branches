package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("modified in branch1");
        System.out.println("modified in branch2");
        System.out.println("modified while solving conflicts");
    }

    public void branch2() {
        System.out.println("branch2");
        System.out.println("modified in branch1");
    }

    public void branch1() {
        System.out.println("branch1");
    }
}

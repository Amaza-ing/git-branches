package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Modificado en branch1");
    }

    private void change() {
        System.out.println("otra cosa");
        System.out.println("branch1");
        System.out.println("Modificado en branch2");
    }

    public void change() {
        System.out.println("branch2");
    }
}

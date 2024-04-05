package nagesh_corejava.ClassAndObject;

import nagesh_corejava.inheritance.JavacoreInheritance;// to check protected variable is accessed or not

/**Access Specifiers in Java
 * 
 * | A.S\Access  | inside_class  |  outside_class | within_package | outside_package 
 * | private     |    yes        |    no          |  no            |   no
 * | protected   |    yes        |    yes         |  yes           |  yes (with inheritence)
 * | default     |    yes        |    yes         |  yes           |  no
 * | public      |    yes        |    yes         |  yes           |  yes
 */


public class ClassAndObjectMain extends JavacoreInheritance {

	public static void main(String[] args) {
          ClassAndObject one = new ClassAndObject("Nagesh",21,7483158421l);// for long , double, and float values add suffix as d, l, or f
          System.out.println(one);
          one.setAge(45);
          System.out.println(one);//one.name we can't print because it is private member
          one.setGroup("Root");
          System.out.println(one.group);// group is a public so it can accessible everywhere
          System.out.println(one.getName()); 
           
          ClassAndObjectMain n=new ClassAndObjectMain();
          JavacoreInheritance j= new JavacoreInheritance();
          j.setName("TNSIF Nagesh");
          System.out.println(n.name); //name is visible to inherited class ClassAndObjectMain
          
          
	}
}

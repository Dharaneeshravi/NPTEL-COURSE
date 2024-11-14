package Constructor.ParentChildClassConstructor;

public class ParentChildClassConstructor {


    /*
                         This code is  accepted
         class P
         {
         }
         class C extends P
         {
         }
     */

    /*
                          This code is  accepted
        class P
         {

         p()
         {
         }

         }
         class C extends P
         {
         }

     */


    /*
                             This code is not  accepted
          class P
         {

         p(int i)
         {
         }

         }
         class C extends P
         {
         }

         To solve the problem use the default constructor in parent class
     */
}

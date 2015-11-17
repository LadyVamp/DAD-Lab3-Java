import java.awt.*;
import java.applet.*;

public class MyAppletAction extends Applet
{
    TextField t1=new TextField(), t2=new TextField(),
              t3=new TextField();
    Button b1=new Button("+") /*,b2=new Button("*")*/;
    Button b3=new Button("-") /*, b4=new Button("/")*/;
    Button b5=new Button("Очистить список операций");
    List L=new List();
              
    public void init()
    {
        setLayout(null);
        t1.setBounds(50, 50, 100, 20);
        t2.setBounds(50, 90, 100, 20);
        t3.setBounds(50, 130, 100, 20);
        b1.setBounds(170, 50, 20, 20);
//        b2.setBounds(170, 90, 20, 20);
        b3.setBounds(210, 50, 20, 20);
//        b4.setBounds(210, 90, 20, 20);
        L.setBounds(250, 50, 150, 150);
        b5.setBounds(250, 230, 160, 20);
 
        
        add(t1); add(t2); add(t3); add(b1); /*add(b2);*/
        add(b3); /*add(b4);*/ add(L); add(b5);

        setBackground(new Color(200, 200, 200));

    }
     public boolean action(Event e, Object obj)
     {
        double x, y, z=0;
        String str="";
        x=new Double(t1.getText()).doubleValue();
        y=new Double(t2.getText()).doubleValue();
        str=x+"";
        if (e.target==b1) {
           z=x+y;
           str+=" + ";
        } 
//        if (e.target==b2) {
//          z=x*y;
//          str+=" * ";
//        }
        if (e.target==b3) {
           z=x-y;
           str+=" - ";
        } 
//        if (e.target==b4) {
//          z=x/y;
//          str+=" / ";
//        }
        str+=y+" = "+z;
        t3.setText(String.valueOf(z));
        L.add(str);
        
        return true;    
     }
   /*  public static void main(String[] args) {
        // TODO code application logic here
         MyFrameAction F=new MyFrameAction("Пример окна с обработкой событий от кнопок");
    }    */
}

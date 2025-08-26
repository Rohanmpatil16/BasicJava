import java.awt.*;
import java.applet.*;
public class applet1 extends Applet
{
	public void paint(Graphics g)
	{
		setBackground(Color.GRAY);
		g.drawLine(20,30,40,50);
	}
	
}
/*
<applet code="applet1.class"Width="200"Height="200">
</applet>
*/
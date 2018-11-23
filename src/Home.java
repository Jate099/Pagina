import java.util.Date;

import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;

public class Home {
	private PApplet app;
	private Date fecha;
	private String dia;
	private PImage buho;
	private PFont roboto1, roboto2;
	private PImage contenedorNoti, cuadros_notas,rosa,noti,noti2,scroll;

	public Home(PApplet app) {
		this.app = app;
		roboto1 = app.createFont("Roboto-Bold.ttf", 20);
		roboto2 = app.createFont("Roboto-Regular.ttf", 20);
		fecha = new Date();
		buho = app.loadImage("Buho-estudianto.png");
		cuadros_notas = app.loadImage("cuadros-notas.png");
		contenedorNoti = app.loadImage("contenedor-notificaciones.png");
		rosa = app.loadImage("rosa.png");
		noti = app.loadImage("notificacion.png");
		noti2 = app.loadImage("notificacion2.png");
		scroll = app.loadImage("scroll-bar.png");
	}

	public void pintar() {
		app.image(cuadros_notas, 190, 124);
		app.image(cuadros_notas, 497, 124);
		app.image(cuadros_notas, 804, 124);
		app.image(contenedorNoti, 190, 327);
		app.image(rosa, 192, 327);
		app.image(noti,238,393);
		app.image(scroll, 751, 394);
		for (int i = 0; i < 2; i++) {
			app.image(noti2, 238, noti2.height*i+481);
		}
		switch (fecha.getDay()) {
		case 1:
			dia = "LUN";
			break;
		case 2:
			dia = "MAR";
			break;
		case 3:
			dia = "MIE";
			break;
		case 4:
			dia = "JUE";
			break;
		case 5:
			dia = "VIE";
			break;
		case 6:
			dia = "SAB";
			break;
		case 7:
			dia = "DOM";
			break;
		}
		app.noStroke();
		app.fill(232, 71, 91);
		app.textFont(roboto1);
		app.text(dia, 230, 178);
		app.textFont(roboto2);
		app.ellipse(209 + (74/2), 188 + (74/2), 74, 74);
		app.fill(255);
		app.textSize(30);
		app.text(fecha.getDate(), 229, 236);
		app.textSize(17);
		app.textFont(roboto2);

		app.fill(116,111,125);
		app.textSize(16);
		app.text("No tienes ningun \nevento planeado \npara hoy.", 295, 204);
		app.textSize(17);
		
		app.image(buho, 873, 394);
	}

	public void mouse() {
		// TODO Auto-generated method stub

	}
}

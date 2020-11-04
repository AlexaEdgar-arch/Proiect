package gadget;
import java.util.*;


public class main {

	public static void main(String[] args) {
		
		// TEST COMMIT FACUT DE BOERU DOAR CA SA VAD DACA MERGE PUP
		
		Gadget ceva = new Gadget("sony","aparat","brand de brand","conect","plastic",10,"negru",400,14,15,"comp");
		Gadget altceva = new Gadget(ceva);
		System.out.println(ceva);
		System.out.println(altceva);
		
		System.out.println("///////////////////////////////////////////////////////////////////////////////////////");
		ArrayList<Reportofon> listaReportofon = new ArrayList<Reportofon>();
		listaReportofon.add(new Reportofon(null, null, null, null, null, 0, null, 0, 0, 0, null, true,10,20));
		listaReportofon.add(new Reportofon(null, null, null, null, null, 0, null, 0, 0, 0, null, false,16,29));
		listaReportofon.add(new Reportofon(null, null, null, null, null, 0, null, 0, 0, 0, null, false,11,20));
		for (Reportofon i: listaReportofon)
		{
			if (i.tipStocare == true){
				System.out.println(i);
			}
		}
		ArrayList<MiniCamera> listaCamera = new ArrayList<MiniCamera>();
		listaCamera.add(new MiniCamera(null, null, null, null, null, 0, null, 0, 0, 0, null, 0, 0, false));
		listaCamera.add(new MiniCamera(null, null, null, null, null, 0, null, 0, 0, 0, null, 0, 0, true));
		listaCamera.add(new MiniCamera(null, null, null, null, null, 0, null, 0, 0, 0, null, 0, 0, true));
		for (MiniCamera i: listaCamera)
		{
			if (i.redare == false){
				System.out.println(i);
			}
		}
		ArrayList<Gadget> listaGadget = new ArrayList<Gadget>();
		listaGadget.add(new Gadget(null, null, null, null, null, 0, null, 0, 0, 0, null));
		listaGadget.add(new Gadget(null, null, null, null, null, 0, null, 0, 0, 0, "altceva"));
		listaGadget.add(new Gadget(null, null, null, null, null, 0, null, 0, 0, 0, "si mai mult"));
		for (Gadget i: listaGadget)
		{
			if (i.compatibilitate != null){
				System.out.println(i);
			}
		}
	}
}

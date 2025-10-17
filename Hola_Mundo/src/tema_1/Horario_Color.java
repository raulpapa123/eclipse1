package tema_1;

public class Horario_Color {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.printf("%15s %15s %15s %15s %15s %15s\n"," ","Lunes","Martes","Miércoles","Jueves","Viernes");
		System.out.println("--------------------------------------------------------------------------------------------------");
		System.out.printf("%15s %29s %28s %28s %28s %28s\n","8:30 9:30","\033[33m IPE I \033[39;49m","\033[32m LMSGI \033[39;49m","\033[32m LMSGI \033[39;49m","\033[34m PROGR \033[39;49m","\033[34m PROGR \033[39;49m");
		System.out.printf("%15s %29s %28s %28s %28s %28s\n","9:30 10:30","\033[31m ENDES \033[39;49m","\033[32m LMSGI \033[39;49m","\033[31m ENDES \033[39;49m","\033[34m PROGR \033[39;49m","\033[34m PROGR \033[39;49m");
		System.out.printf("%15s %29s %28s %28s %28s %28s\n","10:30 11:30","\033[31m ENDES \033[39;49m","\033[34m PROGR \033[39;49m","\033[34m PROGR \033[39;49m","\033[33m IPE I \033[39;49m","\033[33m IPE I \033[39;49m");
		System.out.printf("%15s %29s %28s %28s %28s %28s\n","12:00 13:00","\033[95m SIINF \033[39;49m","\033[34m PROGR \033[39;49m","\033[34m PROGR \033[39;49m","\033[36m BADAT \033[39;49m","\033[37m SASP \033[39;49m");
		System.out.printf("%15s %29s %28s %28s %28s %28s\n","13:00 14:00","\033[95m SIINF \033[39;49m","\033[36m BADAT \033[39;49m","\033[95m SIINF \033[39;49m","\033[36m BADAT \033[39;49m","\033[36m BADAT \033[39;49m");
		System.out.printf("%15s %29s %28s %28s %28s %28s\n","14:00 15:00","\033[95m SIINF \033[39;49m","\033[36m BADAT \033[39;49m","\033[95m SIINF \033[39;49m","\033[91m DASPGS \033[39;49m","\033[36m BADAT \033[39;49m");
	}

}

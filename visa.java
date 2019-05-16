import java.util.Scanner;


public class visa {
	
	// Helppo visa:
	private static void helppo() {
		Scanner lukija = new Scanner(System.in);
		int pisteet = 0;
		int valinta = 0;
		System.out.println("Helppo valittu! Valitse oikea vastaus vaihtoehtoa vastaavalla numeron‰pp‰imell‰.");
		
		//Ensimm‰inen kysymys ( Tulostaa kysymyksen ja vaihtoehdot, m‰‰ritt‰‰ if lauseella oikean vastauksen ja lis‰‰ pisteen. T‰m‰n j‰lkeen nollaa valinta muuttujan
		System.out.println("Min‰ vuonna pelikonsoli WII julkaistiin: \n1: 2006\n2: 2008 \n3: 2010");
		valinta = lukija.nextInt();
		if(valinta == 1) {
			pisteet++;
			System.out.println("Oikein!");
		}else System.out.println("V‰‰rin");
		valinta = 0;
		
		//Toinen kysymys
		System.out.println("Gameboyn valmistaja? \n1: Sony \n2: Nintendo \n3: Microsoft");
		valinta = lukija.nextInt();
		if(valinta == 2) {
			pisteet++;
			System.out.println("Oikein!");
		}else System.out.println("V‰‰rin");
		valinta = 0;
		
		//Kolmas kysymys
		System.out.println("Mik‰ peli innosti pelaajat ulkoilemaan vuonna 2016? \n1: Wii Sport \n2: Pokemon GO \n3: Pokemon Sport");
		valinta = lukija.nextInt();
		if(valinta == 2) {
			pisteet++;
			System.out.println("Oikein!");
		}else System.out.println("V‰‰rin");
		valinta = 0;
		
		//Nelj‰s kysymys
		System.out.println("Miss‰ maassa kehitettiin pulmapeli TETRIS? \n1: Neuvostoliitto \n2: Japani\n3: USA");
		valinta = lukija.nextInt();
		if(valinta == 1) {
			pisteet++;
			System.out.println("Oikein!");
		}else System.out.println("V‰‰rin");
		valinta = 0;
		
		//Viides kysymys
		System.out.println("Mik‰ el‰in Sonic on? \n1: M‰yr‰ \n2: Ei mik‰‰n \n3: Siili");
		valinta = lukija.nextInt();
		if(valinta == 3) {
			pisteet++;
			System.out.println("Oikein!");
		}else System.out.println("V‰‰rin");
		valinta = 0;
		
		//Kuudes kysymys
		System.out.println("Mik‰ on tunnetun pelihahmo Marion ammatti? \n1: Siivoaja \n2: Talonmies \n3: Putkimies");
		valinta = lukija.nextInt();
		if(valinta == 3) {
			pisteet++;
			System.out.println("Oikein!");
		}else System.out.println("V‰‰rin");
		valinta = 0;
		
		//Seitsem‰s kysymys
		System.out.println("Mik‰ on keltaisen Angry Birdin erikoiskyky? \n1: Syˆksy \n2: Pommi \n3: Jakaantuminen");
		valinta = lukija.nextInt();
		if(valinta == 1) {
			pisteet++;
			System.out.println("Oikein!");
		}else System.out.println("V‰‰rin");
		valinta = 0;
		
		//Kahdeksas kysymys
		System.out.println("Mik‰ peli on tunnettu tansseistaan? \n1: Cs:go \n2: Fortnite \n3: Minecraft");
		valinta = lukija.nextInt();
		if(valinta == 2) {
			pisteet++;
			System.out.println("Oikein!");
		}else System.out.println("V‰‰rin");
		valinta = 0;
		
		//Yhdeks‰s kyss‰ri
		System.out.println("Mihin genreen pelisarja the Sims luokitellaan? \n1: Simulaatio \n2: Toiminta \n3: Pulmapeli");
		valinta = lukija.nextInt();
		if(valinta == 1) {
			pisteet++;
			System.out.println("Oikein!");
		}else System.out.println("V‰‰rin");
		valinta = 0;
		
		//Kymmenes kysymys
		System.out.println("Mille alustalle CRASH bandicoot peli alunuperin julkaistiin? \n1: XBOX \n2: Game Cube \n3: PlayStation");
		valinta = lukija.nextInt();
		if(valinta == 3) {
			pisteet++;
			System.out.println("Oikein!");
		}else System.out.println("V‰‰rin");
		valinta = 0;
		
		yhteenveto(pisteet);
	}
	
	// Keskivaikea visa:

	private static void keskivaikea() {
		Scanner lukija = new Scanner(System.in);
		int pisteet = 0;
		int valinta = 0;
		System.out.println("Keskivaikea valittu! Valitse oikea vastaus vaihtoehtoa vastaavalla numeron‰pp‰imell‰.");
		
		//Ensimm‰inen kysymys ( Tulostaa kysymyksen ja vaihtoehdot, m‰‰ritt‰‰ if lauseella oikean vastauksen ja lis‰‰ pisteen. T‰m‰n j‰lkeen nollaa valinta muuttujan
		System.out.println("Kuka oli ensimm‰inen suomalainen, joka voitti the International DOTA2 mestaruuden? \n1: Lasse Urpalainen \"matumbaman\"\n2: Jesse Vainikka \"Jerax\" \n3: Benjamin L‰‰r‰ \"notahax\"\n4: Topias Taavitsainen \"topson\"\n5: Juho Karjalainen \"createk\"");
		valinta = lukija.nextInt();
		if(valinta == 1) {
			pisteet++;
			System.out.println("Oikein!");
		}else System.out.println("V‰‰rin");
		valinta = 0;
		
		//Toinen kysymys
		System.out.println("Mik‰ on Marion alkuper‰inen nimi? \n1: Mario \n2: Jumpman \n3: Red \n4: Plumber \n5: It's me ");
		valinta = lukija.nextInt();
		if(valinta == 2) {
			pisteet++;
			System.out.println("Oikein!");
		}else System.out.println("V‰‰rin");
		valinta = 0;
		
		//Kolmas kysymys
		System.out.println("Mik‰ on suurin pelien jakelualusta PC:lle? \n1: Epic games \n2: Google play store \n3: Xbox live \n4: Steam \n5: Origin");
		valinta = lukija.nextInt();
		if(valinta == 4) {
			pisteet++;
			System.out.println("Oikein!");
		}else System.out.println("V‰‰rin");
		valinta = 0;
		
		//Nelj‰s kysymys
		System.out.println("Kuinka paljon aktiivisia pelaajia fortnitell‰ oli vuonna 2018? \n1: 6 miljoonaa \n2: 112 miljoonaa \n3: miljoona \n4: 40 miljoonaa \n5: 35 miljoonaa");
		valinta = lukija.nextInt();
		if(valinta == 4) {
			pisteet++;
			System.out.println("Oikein!");
		}else System.out.println("V‰‰rin");
		valinta = 0;
		
		//Viides kysymys
		System.out.println("Mik‰ PC peli on tunnettu pahamaineisesta \"YOU DIED\" -screenist‰, joka tulee toistumaan pelin aikana useaan oteeseen? \n1: Skyrim \n2: Shadow of mordor \n3: Witcher \n4: My Little Pony\n5: Dark Souls");
		valinta = lukija.nextInt();
		if(valinta == 5) {
			pisteet++;
			System.out.println("Oikein!");
		}else System.out.println("V‰‰rin");
		valinta = 0;
		
		//Kuudes kysymys
		System.out.println("Mik‰ on viimeisin Final Fanasy osa nimelt‰‰n? \n1: Final Fantasy XV \n2: Final Fantasy XVI \n3: Final Fantasy XIV \n4: Final Fantasy VII \n5: Final Fantasy XIII-2");
		valinta = lukija.nextInt();
		if(valinta == 1) {
			pisteet++;
			System.out.println("Oikein!");
		}else System.out.println("V‰‰rin");
		valinta = 0;
		
		//Seitsem‰s kysymys
		System.out.println("Mink‰ pelin yksi vastuksista on \"Diablo\" \n1: Torchlight \n2: Diablo \n3: Path of exile\n4: Dark Souls\n5: Alan Wake");
		valinta = lukija.nextInt();
		if(valinta == 2) {
			pisteet++;
			System.out.println("Oikein!");
		}else System.out.println("V‰‰rin");
		valinta = 0;
		
		//Kahdeksas kysymys
		System.out.println("Mik‰ on Persona 5 pelin p‰‰henkilˆn virallinen nimi? \n1: Akira Kurusu \n2: Link \n3: Aisaka Taiga\n4: Akechi Goro\n5: Ren Amamiya");
		valinta = lukija.nextInt();
		if(valinta == 5) {
			pisteet++;
			System.out.println("Oikein!");
		}else System.out.println("V‰‰rin");
		valinta = 0;
		
		//Yhdeks‰s kysymys
		System.out.println("Kuinka monta peli‰ kuuluu pelisarjaan Kingdom Hearts? \n1: 11 \n2: 14\n3: 22\n4: 3\n5: 6");
		valinta = lukija.nextInt();
		if(valinta == 2) {
			pisteet++;
			System.out.println("Oikein!");
		}else System.out.println("V‰‰rin");
		valinta = 0;
		
		//Kymmenes kysymys
		System.out.println("Mit‰ asioita Donkey Kong heittelee Marioa p‰in Donkey Kong peliss‰? \n1: Tynnyreit‰ \n2: Banaaneja \n3: Kivi‰ \n4: Pommeja\n5: Laatikoita");
		valinta = lukija.nextInt();
		if(valinta == 1) {
			pisteet++;
			System.out.println("Oikein!");
		}else System.out.println("V‰‰rin");
		valinta = 0;
		
		yhteenveto(pisteet);
	}
	
	
	
	
	// Vaikea visa:
	private static void vaikea() {
		Scanner lukija = new Scanner(System.in);
		int pisteet = 0;
		int valinta = 0;
		System.out.println("Vaikea valittu, t‰st‰ et selvi‰! Valitse oikea vastaus vaihtoehtoa vastaavalla numeron‰pp‰imell‰.");
		
		//Ensimm‰inen kysymys
		System.out.println("Mik‰ on viides julkaistu peli Shin Megami Tensei sarjassa? \n1: Shin Megami Tensei V \n2: Shin Megami Tensei: if... \n3: Shin Megami Tensei III: Nocturne \n4: Shin Megami Tensei IV \n5: Shin Megami Tensei: Strange Journey");
		valinta = lukija.nextInt();
		if(valinta == 3) {
			pisteet++;
			System.out.println("Oikein!");
		}else System.out.println("V‰‰rin");
		valinta = 0;
		
		//Toinen kysymys
		System.out.println("Montako peli sankaria suositussa Warcraft III modissa DotA:ssa on? \n1: 98 \n2: 104 \n3: 111 \n4: 123\n5: 106");
		valinta = lukija.nextInt();
		if(valinta == 2) {
			pisteet++;
			System.out.println("Oikein!");
		}else System.out.println("V‰‰rin");
		valinta = 0;
		
		//Kolmas kysymys
		System.out.println("Mik‰ on Sekiro: Shadows Die Twice-pelin p‰‰henkilˆn oikea japaninkielinen nimi? \n1: Sekiro \n2: Tora \n3: Okami \n4: Sakura \n5: Amiyon");
		valinta = lukija.nextInt();
		if(valinta == 3) {
			pisteet++;
			System.out.println("Oikein!");
		}else System.out.println("V‰‰rin");
		valinta = 0;
		
		//Nelj‰s kysymys
		System.out.println("Milloin ensimm‰inen Ratchet and Clank julkaistiin? \n1: 3.11.2001  \n2: 24.6.2004 \n3: 11.11.2003 \n4: 4.11.2001\n5: 1.1.2000");
		valinta = lukija.nextInt();
		if(valinta == 4) {
			pisteet++;
			System.out.println("Oikein!");
		}else System.out.println("V‰‰rin");
		valinta = 0;
		
		//Viides kysymys
		System.out.println("Paljon MP7 ase maksaa CS:GO peliss‰? \n1: 1500 \n2: 950 \n3: 1450 \n4: 1700\n5: 1600");
		valinta = lukija.nextInt();
		if(valinta == 1) {
			pisteet++;
			System.out.println("Oikein!");
		}else System.out.println("V‰‰rin");
		valinta = 0;
		
		//Kuudes kysymys
		System.out.println("Kuinka monessa Persona-sarjan peliss‰ on naisp‰‰osa? \n1: Ei yhdess‰k‰‰n \n2: Yhdess‰ \n3: Kahdessa \n4: Kolmessa \n5: Kaikissa");
		valinta = lukija.nextInt();
		if(valinta == 3) {
			pisteet++;
			System.out.println("Oikein!");
		}else System.out.println("V‰‰rin");
		valinta = 0;
		
		//Seitsem‰s kysymys
		System.out.println("Kuinka monta pokemonia lis‰ttiin Generation II aikana? \n1: 100 \n2: 52 \n3: 320 \n4: 345 \n5: 23");
		valinta = lukija.nextInt();
		if(valinta == 1) {
			pisteet++;
			System.out.println("Oikein!");
		}else System.out.println("V‰‰rin");
		valinta = 0;
		
		//Kahdeksas kysymys
		System.out.println("Mik‰ on ensimm‰inen Aeon, jonka pelaaja saa k‰yttˆˆns‰ Final Fantasy X-peliss‰? \n1: Ifrit \n2: Shiva \n3: Valefor \n4: Ixion \n5: Bahamut");
		valinta = lukija.nextInt();
		if(valinta == 3) {
			pisteet++;
			System.out.println("Oikein!");
		}else System.out.println("V‰‰rin");
		valinta = 0;
		
		//Yhdeks‰s kysymys
		System.out.println("Mik‰ on Yoshin oikea nimi? \n1: Yoshisaur Labocania \n2: T. Yoshisaur Munchakoopas \n3: Yoshisaur Taurus \n4: Munchakoopas\n5: Yoshisaur Aerosteon");
		valinta = lukija.nextInt();
		if(valinta == 2) {
			pisteet++;
			System.out.println("Oikein!");
		}else System.out.println("V‰‰rin");
		valinta = 0;
		
		//Kymmenes kysymys
		System.out.println("Mihin mobiilipeliin japanilaiset k‰yttiv‰t eniten rahaa vuonna 2018? \n1: Fate/Grand Order \n2: Dragon Ball Z: Dokkan Battle \n3: Idolmaster Cinderella Girls Starlight Stage \n4: Pokemon Go \n5: Monster Strike");
		valinta = lukija.nextInt();
		if(valinta == 5) {
			pisteet++;
			System.out.println("Oikein!");
		}else System.out.println("V‰‰rin");
		valinta = 0;
		
		yhteenveto(pisteet);
	}
	
	//Yhteenveto joka kutsutaan pelin lopussa
	private static void yhteenveto(int pisteet) {
		System.out.println("Pisteet:" + pisteet + "/10");
		
		if(pisteet == 10)System.out.println("Erinomainen suoritus!");
		else if(pisteet <= 9 && pisteet >= 7)System.out.println("Hyvin meni =)");
		else if(pisteet <= 6 && pisteet >= 4)System.out.println("Tyydyt‰v‰t suoritus");
		else if(pisteet <= 3 && pisteet >= 0)System.out.println("Et tied‰ mit‰‰n peleist‰!");
		else System.out.println("Mit‰ olet tehnyt");
		
		
	}
	
	// Main metodi
	public static void main (String args[]) {
		
		Scanner lukija = new Scanner(System.in);
		int vaikeus;
		
		
		do {
		System.out.println("Tervetuloa pelivisaan!");
		
		//Sinnik‰s kyselij‰ vaikeuden valinnasta
		

		System.out.println("Valitse vaikeusaste! \n1 = Helppo \n2 = Keskivaikea \n3 = Vaikea");	
		vaikeus = lukija.nextInt(); 
		}while(vaikeus < 1 || vaikeus > 3);
		
		//kutsutaan eri vaikeusasteiden metodit
		if(vaikeus == 1) helppo();
		if(vaikeus == 2) keskivaikea();
		if(vaikeus == 3) vaikea();
		}
		
}

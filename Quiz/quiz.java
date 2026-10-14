package OPP_BIG_PROJECTS.Quiz;

import java.util.Random;
import java.util.Scanner;
public class quiz {

	public static void main(String[] args) {
		System.out.println();
		System.out.println();
		System.out.println();
		String [] art = {
				"	 █╗    ██╗███████╗██╗      ██████╗ ██████╗ ███╗   ███╗███████╗    ████████╗ ██████╗ ",
				"	██║    ██║██╔════╝██║     ██╔════╝██╔═══██╗████╗ ████║██╔════╝    ╚══██╔══╝██╔═══██╗",
				"	██║ █╗ ██║█████╗  ██║     ██║     ██║   ██║██╔████╔██║█████╗         ██║   ██║   ██║",
				"	██║███╗██║██╔══╝  ██║     ██║     ██║   ██║██║╚██╔╝██║██╔══╝         ██║   ██║   ██║",
				"	╚███╔███╔╝███████╗███████╗╚██████╗╚██████╔╝██║ ╚═╝ ██║███████╗       ██║   ╚██████╔╝",
				"	 ╚══╝╚══╝ ╚══════╝╚══════╝ ╚═════╝ ╚═════╝ ╚═╝     ╚═╝╚══════╝       ╚═╝    ╚═════╝ ",
				"                                                                                    ",
				"	 ██████╗ ██╗   ██╗██╗███████╗███████╗     ██████╗  █████╗ ███╗   ███╗███████╗██╗██╗",
				"	██╔═══██╗██║   ██║██║╚══███╔╝╚══███╔╝    ██╔════╝ ██╔══██╗████╗ ████║██╔════╝██║██║",
				"	██║   ██║██║   ██║██║  ███╔╝   ███╔╝     ██║  ███╗███████║██╔████╔██║█████╗  ██║██║",
				"	██║▄▄ ██║██║   ██║██║ ███╔╝   ███╔╝      ██║   ██║██╔══██║██║╚██╔╝██║██╔══╝  ╚═╝╚═╝",
				"	╚██████╔╝╚██████╔╝██║███████╗███████╗    ╚██████╔╝██║  ██║██║ ╚═╝ ██║███████╗██╗██╗",
				"	 ╚══▀▀═╝  ╚═════╝ ╚═╝╚══════╝╚══════╝     ╚═════╝ ╚═╝  ╚═╝╚═╝     ╚═╝╚══════╝╚═╝╚═╝",
				"                                                                                      ",	
				"                                                                                    ",
				"	  █████▄ ▄█████ ▄█████ ▄█████   ▄██    ▄████  █████▄  ▄████▄ ██  ██ █████▄   ████▄ ",
				"	  ██▄▄██ ▀▀▀▄▄▄ ██     ▀▀▀▄▄▄    ██   ██  ▄▄▄ ██▄▄██▄ ██  ██ ██  ██ ██▄▄█▀    ▄▄██ ",
				"	  ██▄▄█▀ █████▀ ▀█████ █████▀    ██    ▀███▀  ██   ██ ▀████▀ ▀████▀ ██       ▄▄▄█▀ ",
				"																					   ",
				"																						",
				"																						",
				"																						",
				"=======================================================================================",
				"|Game Info:                                                                           | ",
				"| - Total Questions: 100                                                              | ",
				"| - Subjects: General Knowledge, Filipino, Araling Panlipunan, English, Science,      | ",
				"|   Mathematics, Ethics, Oral Communication, Entrepreneurship, Personal Development   | ",
				"| - Mode : Random Questions                                                           | ",
				"=======================================================================================",
				"",
				"",
				"",
				"=======================================================================================",
				"|IMPORTANT NOTICE:                                                                   | ",
				"| - Answer each questions carefully                                                  | ",
				"| - Only one corrcet answer per questions                                            | ",
				"| - No subject selection available                                                   | ",
				"| - Questions are randomly generate                                                  | ",
				"=======================================================================================",
				"",
				"",
				"                   ==============================================                       ",
				"                   |                   MAIN MENU                |                       ",
				"                   ==============================================                       ",
				"                   | - Game Interface                           |                       ",
				"                   | - Game Info                                |                       ",
				"                   | - Important Notice                         |                       ",
				"                   | - Start Game                               |                       ",
				"                   ==============================================                       ",
				"",
				"",
		};		
		for(String line : art) {
			System.out.println(line);
		}
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter Your Quizzer Name: ");
		String name = s.nextLine();
		
		System.out.print("Enter Any Key To Continue: ");
		String key = s.nextLine();
		
		System.out.println();
		
		String[] questions = {
				
				//General Knowledge
				"What is the chemical symbol for gold?",
				"Who wrote the play Romeo and Juliet?",
				"Which planet is known as the Red Planet?",
				"What is the largest organ in the human body?",
				"In which year did World War II end?",
				"What is the currency of Japan?",
				"Who painted the Mona Lisa?",
				"What is the hardest natural substance on Earth?",
				"Which gas do plants primarily absorb from the atmosphere?",
				"What is the capital city of Australia?",
				
				//Filipino
				"Sino ang may-akda ng epikong Biag ni Lam-ang?",
				"Ano ang kahulugan ng salitang \"epiko\"?",
				"Alin sa mga sumusunod ang halimbawa ng balagtasan?",
				"Ano ang pangunahing tauhan sa Noli Me Tangere ni Jose Rizal?",
				"Bakit tinawag na \"diwa ng himagsikan\" ang El Filibusterismo?",
				"Ano ang uri ng panitikan ang Ang Mabuting Balita?",
				"Sino ang \"Hari ng Balagtasan\"?",
				"Alin ang tamang kahulugan ng \"metapora\"?",
				"Sa Florante at Laura, sino ang minamahal ni Florante?",
				"Ano ang tawag sa tradisyunal na awit ng mga Pilipino na may 4 na taludtod?",

				//Araling Panlipunan
				"Ano ang unang konstitusyon ng Pilipinas?",
				"Sino ang unang pangulo ng Republika ng Pilipinas?",
				"Ano ang pangunahing layunin ng Katipunan?",
				"Saang lungsod nagsimula ang Rebolusyong Pilipino noong 1896?",
				"Ano ang Treaty of Paris (1898)?",
				"Alin ang pinakamalaking isla sa Pilipinas?",
				"Ano ang opisyal na wika ng Pilipinas ayon sa 1987 Constitution?",
				"Sino ang tinawag na \"Utang na Loob President\" dahil sa martial law?",
				"Ano ang pinakamahalagang yamang tao sa Pilipinas?",
				"Alin ang pangunahing ahensya na namamahala sa ekonomiya ng Pilipinas?",

				//English
				"What is the literary device where a word imitates a sound?",
				"In Romeo and Juliet, who says \"O Romeo, Romeo\"?",
				"Identify the verb tense: She has been reading.",
				"What does foreshadowing mean?",
				"Synonym of ephemeral?",
				"Who is the narrator of To Kill a Mockingbird?",
				"Theme of Animal Farm?",
				"Correct sentence: it's vs its?",
				"What is iambic pentameter?",
				"The world is a stage is what?",

				//Science
				"What is the powerhouse of the cell?",
				"Red Planet?",
				"Newton's First Law?",
				"Atomic number 8?",
				"Plants make food by?",
				"pH of water?",
				"Bond that shares electrons?",
				"Tides caused by?",
				"DNA stands for?",
				"Speed of light?",

				//Mathematics
				"Solve: 2x + 5 = 17",
				"Area of circle radius 7?",
				"Simplify sqrt(16*9)",
				"15% of 200?",
				"x² -5x +6 = 0",
				"sin(90)",
				"Factor x²+7x+12",
				"Volume cube side 4",
				"Slope of y=3x-2",
				"3/4 decimal?",

				//Ethics
				"What is utilitarianism?",
				"Who proposed categorical imperative?",
				"What is moral dilemma?",
				"Euthanasia?",
				"Ethical relativism?",
				"Trolley problem tests?",
				"What is plagiarism?",
				"Golden rule?",
				"Corporate social responsibility?",
				"Animal testing field?",

				//Oral Communication
				"What is oral communication?",
				"Who sends message?",
				"Who receives message?",
				"What is feedback?",
				"Non-verbal communication?",
				"Why eye contact?",
				"What is public speaking?",
				"What is communication barrier?",
				"Verbal communication example?",
				"Why pronunciation important?",

				//Entrepreneurship
				"Who is an entrepreneur?",
				"What is business?",
				"What is profit?",
				"What is loss?",
				"Small business example?",
				"Why start business?",
				"What is capital?",
				"What is product?",
				"What is service?",
				"Why customer satisfaction?",

				//Personal Development
				"What is personal development?",
				"Why self-confidence?",
				"What is a goal?",
				"What is time management?",
				"What is self-discipline?",
				"Good habit?",
				"What is decision-making?",
				"Why learning important?",
				"What is motivation?",
				"How to improve yourself?"
				};
		
		String[][] options = {
				//General Knowledge
				{"A.Ag","B.Au","C.Fe","D.Pb"},
				{"A.Charles Dickens","B.William Shakespeare","C.Jane Austen","D.Mark Twain"},
				{"A.Venus","B.Mars","C.Jupiter","D.Saturn"},
				{"A.Liver","B.Heart","C.Skin","D.Brain"},
				{"A.1943","B.1945","C.1947","D.1950"},
				{"A.Yuan","B.Won","C.Yen","D.Ringgit"},
				{"A.Van Gogh","B.Picasso","C.Leonardo da Vinci","D.Michelangelo"},
				{"A.Gold","B.Iron","C.Diamond","D.Quartz"},
				{"A.Oxygen","B.Nitrogen","C.Carbon Dioxide","D.Hydrogen"},
				{"A.Sydney","B.Melbourne","C.Canberra","D.Brisbane"},

				//Filipino
				{"A.Pedro Bucaneg","B.Jose Rizal","C.Lope de Vega","D.Tradisyunal"},
				{"A.Maikling tula","B.Mahabang salaysay","C.Maikling kwento","D.Tula pag-ibig"},
				{"A.Florante","B.Ibong Adarna","C.Debate tula","D.Noli"},
				{"A.Maria Clara","B.Ibarra","C.Elias","D.Tiago"},
				{"A.Masaya","B.Paghihiganti","C.Pag-ibig","D.Pabula"},
				{"A.Nobela","B.Pasyon","C.Tula","D.Maikling kwento"},
				{"A.Jose Corazon","B.Balagtas","C.Lope","D.Hernandez"},
				{"A.Tulad","B.Direkta","C.Pandama","D.Ulit"},
				{"A.Adorna","B.Laura","C.Flerida","D.Alon"},
				{"A.Kundiman","B.Awit","C.Korido","D.Zarzuela"},

				//Araling Panlipunan
				{"A.1935","B.Malolos","C.1973","D.1987"},
				{"A.Laurel","B.Roxas","C.Aguinaldo","D.Quezon"},
				{"A.Kalayaan","B.Religion","C.Business","D.Church"},
				{"A.Manila","B.Cavite","C.Calamba","D.Balintawak"},
				{"A.Kasarinlan","B.Pagbili","C.Pagsuko","D.Digmaan"},
				{"A.Mindanao","B.Luzon","C.Visayas","D.Palawan"},
				{"A.Filipino-English","B.Spanish","C.Tagalog","D.Cebuano"},
				{"A.Marcos","B.Aquino","C.Ramos","D.Arroyo"},
				{"A.Ginto","B.Kabataan","C.Dagat","D.Mayon"},
				{"A.BSP","B.DepEd","C.DENR","D.DILG"},

				//English
				{"A.Metaphor","B.Onomatopoeia","C.Alliteration","D.Simile"},
				{"A.Mercutio","B.Juliet","C.Tybalt","D.Benvolio"},
				{"A.Past","B.Present perfect cont","C.Future","D.Past cont"},
				{"A.Hint future","B.Flashback","C.Irony","D.Climax"},
				{"A.Eternal","B.Fleeting","C.Permanent","D.Robust"},
				{"A.Atticus","B.Boo","C.Scout","D.Jem"},
				{"A.Friendship","B.Power corruption","C.Adventure","D.Romance"},
				{"A.Its","B.It’s","C.No change","D.Dogs"},
				{"A.10 syllables","B.5 syllables","C.Rhyme","D.Free"},
				{"A.Hyperbole","B.Metaphor","C.Person","D.Oxymoron"},

				//Science
				{"A.Nucleus","B.Mitochondria","C.Ribosome","D.Cell wall"},
				{"A.Venus","B.Mars","C.Jupiter","D.Saturn"},
				{"A.F=ma","B.Rest stays rest","C.Action reaction","D.Gravity"},
				{"A.Oxygen","B.Carbon","C.Hydrogen","D.Nitrogen"},
				{"A.Respiration","B.Photosynthesis","C.Digestion","D.Fermentation"},
				{"A.0","B.7","C.14","D.1"},
				{"A.Ionic","B.Covalent","C.Metallic","D.Hydrogen"},
				{"A.Sun","B.Moon","C.Earth","D.Wind"},
				{"A.Deoxyribo","B.Dynamic","C.Direct","D.Deoxy N"},
				{"A.300k","B.150k","C.3k","D.Infinite"},

				//Mathematics
				{"A.6","B.11","C.12","D.22"},
				{"A.22","B.44","C.154","D.219.8"},
				{"A.12","B.144","C.25","D.7"},
				{"A.15","B.30","C.20","D.300"},
				{"A.2,3","B.1,6","C.-2,-3","D.0,5"},
				{"A.0","B.1","C.0.5","D.Undefined"},
				{"A.(x+3)(x+4)","B.(x+2)(x+6)","C.(x+1)(x+12)","D.(x-3)(x-4)"},
				{"A.16","B.64","C.12","D.24"},
				{"A.3","B.-2","C.1","D.0"},
				{"A.0.75","B.0.25","C.1.33","D.0.5"},

				//Ethics
				{"A.Greatest good","B.Duty","C.Rights","D.Virtue"},
				{"A.Mill","B.Kant","C.Aristotle","D.Plato"},
				{"A.Easy","B.Conflict","C.Legal","D.Preference"},
				{"A.Mercy killing","B.Punishment","C.Defense","D.War"},
				{"A.Universal","B.Culture-based","C.Law","D.Feelings"},
				{"A.Utilitarian vs deon","B.Animal","C.Env","D.Business"},
				{"A.Copy","B.Original","C.Summary","D.Quote"},
				{"A.Treat others","B.Eye","C.Survival","D.Might"},
				{"A.Ignore","B.Benefit society","C.Profit","D.Gov"},
				{"A.Bioethics","B.Political","C.Economic","D.Legal"},

				//Oral Communication
				{"A.Writing","B.Speaking","C.Drawing","D.Reading"},
				{"A.Receiver","B.Listener","C.Sender","D.Audience"},
				{"A.Sender","B.Speaker","C.Receiver","D.Writer"},
				{"A.Noise","B.Response","C.Message","D.Topic"},
				{"A.Talking","B.Writing","C.Gestures","D.Reading"},
				{"A.Sleep","B.Confidence","C.Ignore","D.Read"},
				{"A.Alone","B.Animal","C.Audience","D.Write"},
				{"A.Clear","B.Noise","C.Good","D.Eye"},
				{"A.Smile","B.Nod","C.Speaking","D.Wave"},
				{"A.Confuse","B.Clear","C.Fast","D.Quiet"},

				//Entrepreneurship
				{"A.Student","B.Teacher","C.Business starter","D.Employee"},
				{"A.Buying","B.Selling","C.Sleep","D.Play"},
				{"A.Loss","B.Income after expenses","C.Capital","D.Product"},
				{"A.Gain","B.Profit","C.Negative income","D.Capital"},
				{"A.School","B.Hospital","C.Sari-sari","D.Park"},
				{"A.Lose","B.Earn","C.Sleep","D.Waste"},
				{"A.Product","B.Money start","C.Customer","D.Profit"},
				{"A.Service","B.Goods","C.Worker","D.Money"},
				{"A.Selling","B.Work for customers","C.Buy","D.Profit"},
				{"A.Lose","B.Trust","C.Stop","D.Spend"},

				//Personal Development
				{"A.Play","B.Improve","C.Sleep","D.Eat"},
				{"A.Doubt","B.Believe","C.Fear","D.Quiet"},
				{"A.Problem","B.Target","C.Game","D.Food"},
				{"A.Waste","B.Manage","C.Sleep","D.Play"},
				{"A.Lazy","B.Control","C.Ignore","D.Avoid"},
				{"A.Procrastinate","B.Study","C.Late","D.Skip"},
				{"A.Ignore","B.Choose","C.Sleep","D.Play"},
				{"A.Forget","B.Knowledge","C.Sleep","D.Waste"},
				{"A.Lazy","B.Reason","C.Sleep","D.Fear"},
				{"A.Nothing","B.Practice","C.Sleep","D.Avoid"}
				};
		
		String[] answers = {
				
				//General Knowledge
				"B","B","B","C","B","C","C","C","C","C",
				
				//Filipino
				"D","B","C","B","B","B","A","B","B","B",
				
				//Araling Panlipunan
				"B","D","A","D","C","B","A","A","B","A",
				
				//English
				"B","B","B","A","B","C","B","A","A","B",
				
				//Science
				"B","B","B","A","B","B","B","B","A","A",
				
				//Mathematics
				"A","C","A","B","A","B","A","B","A","A",
				
				//Ethics
				"A","B","B","A","B","A","A","A","B","A",
				
				//Oral Communication
				"B","C","C","B","C","B","C","B","C","B",
				
				//Entreprenuership
				"C","B","B","C","C","B","B","B","B","B",
				
				//Personal Development
				"B","B","B","B","B","B","B","B","B","B"
				};
		
		Random rand = new Random();
		
		String playAgain;
		
		do {
		
		int score = 0;
		int rnd;
		
		boolean []used = new boolean[questions.length];
		
		for(int i = 0; i < 10; i++) {
			
			
			do {
				rnd = rand.nextInt(questions.length);	
			}while(used[rnd]);
			
			used[rnd] = true;
			
			System.out.println(questions[rnd]);
			
			for(String option : options[rnd]){
                System.out.println(option);
            }
			long startTime = System.currentTimeMillis();
			System.out.println();
			System.out.println("╔══════════════════════════════════════╗");
			System.out.println("║           ⏱ Time is Ticking!        ║");
			System.out.println("╚══════════════════════════════════════╝");
			System.out.println();
			
			String userAnswers;
			
			do {
				
			System.out.print("Enter Answers [A-D] (10 seconds only): ");
			userAnswers = s.nextLine();
			
			if(!userAnswers.equalsIgnoreCase("A") && !userAnswers.equalsIgnoreCase("B") && !userAnswers.equalsIgnoreCase("C") && !userAnswers.equalsIgnoreCase("D")){
				System.out.println();
		        System.out.println("╔══════════════════════════════════════╗");
		        System.out.println("║   ❌ Invalid Input! Try Again        ║");
		        System.out.println("║      Please enter A, B, C or D       ║");
		        System.out.println("╚══════════════════════════════════════╝");
		        System.out.println();
			}
			} while(!userAnswers.equalsIgnoreCase("A") &&
			        !userAnswers.equalsIgnoreCase("B") &&
			        !userAnswers.equalsIgnoreCase("C") &&
			        !userAnswers.equalsIgnoreCase("D"));
			
			long endTime = System.currentTimeMillis();

			long seconds = (endTime - startTime) / 1000;

			if(seconds > 10){
				System.out.println();
				
				System.out.println("╔══════════════════════════════════════╗");
		    	    System.out.println("║  Your Answer       : " + userAnswers + "               ║");
		    	    System.out.println("║  Correct Answer    : " + answers[rnd] + "               ║");
		    	    System.out.println("╚══════════════════════════════════════╝");
		    	    System.out.println("╔══════════════════════════════════════╗");
				System.out.println("║           ⏱ Time is up!             ║");
				System.out.println("╚══════════════════════════════════════╝");
			    System.out.println();
			    continue;
			}
			if(userAnswers.equalsIgnoreCase(answers[rnd])) {
				System.out.println();
				System.out.println("╔══════════════════════════════════════╗");
				System.out.println("║        ✅ Your Answer is Correct     ║");
				System.out.println("╚══════════════════════════════════════╝");
				System.out.println();
              score++;
          } else {
        	  		System.out.println();
		    	    System.out.println("╔══════════════════════════════════════╗");
		    	    System.out.println("║  Your Answer       : " + userAnswers + "               ║");
		    	    System.out.println("║  Correct Answer    : " + answers[rnd] + "               ║");
		    	    System.out.println("╚══════════════════════════════════════╝");
                System.out.println();
          }
      }
      
		System.out.println("╔══════════════════════════════════════╗");
		System.out.println("║              FINAL SCORE             ║");
		System.out.println("║                  " + score + "/10                ║");
		System.out.println("╚══════════════════════════════════════╝");
			
			
			System.out.println("╔══════════════════════════════════════╗");
			System.out.println("║               REMARKS                ║");
			System.out.println("╠══════════════════════════════════════╣");
			
			if(score == 10) {
			    System.out.println("Excellent work, " + name + "! You achieved a perfect score.");
			}else if(score >= 8){
			    System.out.println("Very good performance, " + name + ". You were close to perfect.");
			}else if(score >= 6){
			    System.out.println("Good effort, " + name + ". Keep striving for improvement.");
			}else if(score >= 4) {
			    System.out.println("Fair attempt, " + name + ". With more practice, you can do better.");
			}else {
			    System.out.println("Needs improvement, " + name + ". Continue studying and you will progress.");
			}
			System.out.print("Play again? (Y/N): ");	 
		    playAgain = s.nextLine();

		} while(playAgain.equalsIgnoreCase("Y"));
	
	}

}

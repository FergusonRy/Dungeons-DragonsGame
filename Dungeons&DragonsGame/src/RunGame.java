
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RunGame
	{
		static String [][] board=new String [25][25];
		static String input;
		static Scanner userInput = new Scanner(System.in);
		static Character c = new Character("", "", "", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, "", "", "", "", "", "");
		static Race r = new Race("", 0, 0, 0, 0, 0, 0);
		static Clas cl = new Clas("", 0);
		static int hitDice;
		static int dieTotal;
		public static void main(String[] args)
			{
				makeCharacter();
				rollStats();
			}
		public static void makeBoard()
		{
			for (int row=0; row<board.length; row++)
				{
					for(int col=0; col<board[0].length; col++)
						{
						System.out.print(board[row][col]=" -");							
						}
					System.out.println();
				}
		}
		public static void GetHealth()
		{
			int hitDice2 = (int) (Math.random() * cl.getHitDie()) + 1;
			c.setHealth(c.getHealth()+hitDice2);
		}
		public static void makeCharacter()
		{
			System.out.println("             (o)");
			System.out.println("             <M");
			System.out.println("             <M"); 
			System.out.println("   .......  //:M------------------------------------------------,,,,,,");
			System.out.println("(O)[]XXXXXX[]I:K+}=====<{H}>================================------------>");
			System.out.println("   ^^^^^^^  \\:W------------------------------------------------''''''");
			System.out.println("             <W");  
			System.out.println("             <W");
			System.out.println("             (O)");
			System.out.println();
			System.out.println();
			System.out.println("Hello, I hope your ready to play an awesome game of DnD.");
			System.out.println("First of all you need to choose your Character's name so...");
			System.out.println("What do you want your characters name to be?");
			String word = userInput.nextLine();
			c.setName(word);
			System.out.println("Welcome " + c.getName() + "!!!");
			System.out.println("first you need to choose a race");
			System.out.println("there is a large number of races and each will effect your ability scores in different ways");
			System.out.println("here are the races you can choose from");
			ArrayList <Race> races = new ArrayList <Race> ();		
			races.add(new Race ("(1) Human", 1, 1, 1, 1, 1, 1));
			races.add(new Race ("(2) Hill Dwarf", 0, 0, 2, 0, 1, 0));
			races.add(new Race ("(3) mountain Dwarf", 2, 0, 2, 0, 0, 0));
			races.add(new Race ("(4) high Elf", 0, 2, 0, 1, 0, 0));
			races.add(new Race ("(5) Dark Elf", 0, 2, 0, 0, 0, 1));
			races.add(new Race ("(6) halfling", 0, 2, 0, 0, 0, 1));
			races.add(new Race ("(7) DragonBorn", 2, 0, 0, 0, 0, 1));
			races.add(new Race ("(8) Forest gnome", 0, 1, 0, 2, 0, 0));
			races.add(new Race ("(9) Rock gnome", 0, 0, 1, 2, 0, 0));
			races.add(new Race ("(10) Half Elf", 1, 1, 0, 0, 0, 2));
			races.add(new Race ("(11) Half Orc", 2, 0, 1, 0, 0, 0));
			races.add(new Race ("(12) Tiefling", 0, 0, 0, 1, 0, 2));
			races.add(new Race ("(13) Half Giant", 2, 0, 2, 0, 0, 0));
			races.add(new Race ("(14) Wood Elf", 0, 2, 0, 0, 1, 0));
			for (Race r : races)
				{
					System.out.println();
					System.out.println("choosing " + r.getName() + ": adds " + r.getStrengthAdd() + " to your Strength, " + r.getDexterityAdd() + " to your Dextarity,");
					System.out.println(r.getConstitutionAdd() + " to your constituion, " + r.getIntelligenceAdd() + " to your Intelligence,");
					System.out.println(r.getWisdomAdd() + " to your wisdom, and " + r.getCharismaAdd() + " to your charisma");
				}
			System.out.println();
			System.out.println("which one would you like to choose?");
			System.out.println("type the number that appears next to the race");
			int cr = userInput.nextInt();
			if (cr>0 && cr<15)
				{
					c.setRacial(races.get(cr-1).getName().substring(4));
					c.setStrength(races.get(cr-1).getStrengthAdd());
					c.setDexterity(races.get(cr-1).getDexterityAdd());
					c.setConstitution(races.get(cr-1).getConstitutionAdd());
					c.setIntelligence(races.get(cr-1).getIntelligenceAdd());
					c.setWisdom(races.get(cr-1).getWisdomAdd());
					c.setCharisma(races.get(cr-1).getCharismaAdd());
				}			
			else 
				{
					System.out.println("you are a Human. Humans are the most versatile of creatures and can be anything!");
					c.setRacial(races.get(0).getName().substring(4));
					c.setStrength(races.get(0).getStrengthAdd());
					c.setDexterity(races.get(0).getDexterityAdd());
					c.setConstitution(races.get(0).getConstitutionAdd());
					c.setIntelligence(races.get(0).getIntelligenceAdd());
					c.setWisdom(races.get(0).getWisdomAdd());
					c.setCharisma(races.get(0).getCharismaAdd());
				}
			System.out.println("now you must choose a class.");
			System.out.println("here are a list of options.");
			ArrayList<Clas> classes = new ArrayList<Clas>();
			classes.add(new Clas("(1) Barbarian", 12));
			classes.add(new Clas("(2) Bard", 8));
			classes.add(new Clas("(3) Cleric", 8));
			classes.add(new Clas("(4) Druid", 8));
			classes.add(new Clas("(5) Fighter", 10));
			classes.add(new Clas("(6) Monk", 8));
			classes.add(new Clas("(7) Paladin", 10));
			classes.add(new Clas("(8) Ranger", 10));
			classes.add(new Clas("(9) Rogue", 8));
			classes.add(new Clas("(10) Sorcerer", 6));
			classes.add(new Clas("(11) Warlock", 8));
			classes.add(new Clas("(12) Wizard", 6));
			for (Clas cl : classes)
				{
					System.out.println();
					System.out.println("choosing " + cl.getName() + " and your hitpoint points are equal to 1 die " + cl.getHitDie() + " times your character level");
					System.out.println("you will also gain proficiency in certain types of armor and weapons");
				}
			System.out.println();
			System.out.println("which class would you like to be type the number next to the name of the class below to select the class");
			System.out.println("the defalt class is fighter.");
			int clss = userInput.nextInt();
			if (clss>0 && clss < 13)
				{
					c.setClas(classes.get(clss-1).getName().substring(4));
					c.setProficiency(2);
					c.setLevel(1);
					if (classes.get(clss-1).getHitDie() == 12)
						{
							hitDice=(int) (Math.random() * classes.get(clss-1).getHitDie()) + 1;
							if (hitDice<8)
								{
									c.setHealth(8);
								}
							else 
								{
									c.setHealth(hitDice);
								}
						}
					if (classes.get(clss-1).getHitDie() == 10)
						{
							hitDice=(int) (Math.random() * classes.get(clss-1).getHitDie()) + 1;
							if (hitDice<6)
								{
									c.setHealth(6);
								}
							else 
								{
									c.setHealth(hitDice);
								}
						}
					if (classes.get(clss-1).getHitDie() == 8)
						{
							hitDice=(int) (Math.random() * classes.get(clss-1).getHitDie()) + 1;
							if (hitDice<5)
								{
									c.setHealth(5);
								}
							else 
								{
									c.setHealth(hitDice);
								}
						}
					if (classes.get(clss-1).getHitDie() == 6)
						{
							hitDice=(int) (Math.random() * classes.get(clss-1).getHitDie()) + 1;
							if (hitDice<4)
								{
									c.setHealth(4);
								}
							else 
								{
									c.setHealth(hitDice);
								}
						}
				}
			else
				{
					c.setClas(classes.get(4).getName().substring(4));
					c.setProficiency(2);
					c.setLevel(1);
					hitDice=(int) (Math.random() * classes.get(4).getHitDie()) + 1;
					if (hitDice<6)
						{
							c.setHealth(6);
						}
					else 
						{
							c.setHealth(hitDice);
						}
				}
			System.out.println(c.getName() +" "+ c.getRacial() +" "+ c.getClas() +" "+ c.getStrength() +" "+ c.getDexterity() +" "+ c.getConstitution() +" "+ c.getIntelligence() +" "+ c.getWisdom() +" "+ c.getCharisma());		
		
		}
		public static void rollStats()
		{
			System.out.println("now the most exciting part about building a D&D character.");
			System.out.println("rolling type 1 to roll");
			int rd = userInput.nextInt();
			if (rd==1)
				{
					ArrayList<Integer> abilityScores = new ArrayList<Integer>();
					abilityScores.add(new Integer(0));
					abilityScores.add(new Integer(0));
					abilityScores.add(new Integer(0));
					abilityScores.add(new Integer(0));
					abilityScores.add(new Integer(0));
					abilityScores.add(new Integer(0));
					for (int i=0; i<6; i++)
						{
							ArrayList<Integer> dieRoll = new ArrayList<Integer>();
							dieRoll.add(new Integer((int) (Math.random() * 6) + 1));
							dieRoll.add(new Integer((int) (Math.random() * 6) + 1));
							dieRoll.add(new Integer((int) (Math.random() * 6) + 1));
							dieRoll.add(new Integer((int) (Math.random() * 6) + 1));				
							System.out.println("you rolled " + dieRoll.get(0) + " " + dieRoll.get(1) + " " + dieRoll.get(2) + " " + dieRoll.get(3) + " ");
							Collections.sort(dieRoll);	
							dieRoll.remove(0);
							dieTotal = dieRoll.get(0) + dieRoll.get(1) + dieRoll.get(2);
							if (dieTotal<8)
								{
									dieTotal=8;
								}
							
						}
				}
			else
				{
					System.out.println("ble");
				}
		}
		
		

	}

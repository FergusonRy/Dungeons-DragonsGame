
public class Race
	{
		private String name;
		private int strengthAdd;
		private int dexterityAdd;
		private int constitutionAdd;
		private int intelligenceAdd;
		private int wisdomAdd;
		private int charismaAdd;
		
		public Race (String n, int sa, int da, int cona, int ia, int wa, int cha)
		{
			name = n;
			strengthAdd = sa;
			dexterityAdd = da;
			constitutionAdd = cona;
			intelligenceAdd = ia;
			wisdomAdd = wa;
			charismaAdd = cha;
		}

		public String getName()
			{
				return name;
			}

		public void setName(String name)
			{
				this.name = name;
			}

		public int getStrengthAdd()
			{
				return strengthAdd;
			}

		public void setStrengthAdd(int strengthAdd)
			{
				this.strengthAdd = strengthAdd;
			}

		public int getDexterityAdd()
			{
				return dexterityAdd;
			}

		public void setDexterityAdd(int dexterityAdd)
			{
				this.dexterityAdd = dexterityAdd;
			}

		public int getConstitutionAdd()
			{
				return constitutionAdd;
			}

		public void setConstitutionAdd(int constitutionAdd)
			{
				this.constitutionAdd = constitutionAdd;
			}

		public int getIntelligenceAdd()
			{
				return intelligenceAdd;
			}

		public void setIntelligenceAdd(int intelligenceAdd)
			{
				this.intelligenceAdd = intelligenceAdd;
			}

		public int getWisdomAdd()
			{
				return wisdomAdd;
			}

		public void setWisdomAdd(int wisdomAdd)
			{
				this.wisdomAdd = wisdomAdd;
			}

		public int getCharismaAdd()
			{
				return charismaAdd;
			}

		public void setCharismaAdd(int charismaAdd)
			{
				this.charismaAdd = charismaAdd;
			}
		

	}

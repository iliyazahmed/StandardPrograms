class Sample 
{
	public  static Sample sample = null;

	private  Sample()
	{
		System.out.println("In Constructor....");
	}

	public static Sample get()
	{
		if(sample == null)
		{
			sample = new Sample();
		}

		return sample;
	}
}
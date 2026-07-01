public class Policy
{
   private int policyNumber;
   private String providerName;
   private PolicyHolder policyHolder;
   private static int policyCount = 0;

   public Policy()
   {
      policyNumber = 0;
      providerName = "";
      policyHolder = new PolicyHolder();
      policyCount++;
   }

   public Policy(int policyNumber, String providerName, PolicyHolder policyHolder)
   {
      this.policyNumber = policyNumber;
      this.providerName = providerName;
      this.policyHolder = new PolicyHolder(policyHolder.getFirstName(), policyHolder.getLastName(),
                                           policyHolder.getAge(), policyHolder.getSmokingStatus(),
                                           policyHolder.getHeight(), policyHolder.getWeight());
      policyCount++;
   }

   public double calculatePolicyPrice()
   {
      double price = 600.0;
      double bmi = policyHolder.getBMI();

      if (policyHolder.getAge() > 50)
      {
         price += 75.0;
      }

      if (policyHolder.getSmokingStatus().equalsIgnoreCase("smoker"))
      {
         price += 100.0;
      }

      if (bmi > 35)
      {
         price += (bmi - 35) * 20;
      }

      return price;
   }

   public int getPolicyNumber()
   {
      return policyNumber;
   }

   public String getProviderName()
   {
      return providerName;
   }

   public PolicyHolder getPolicyHolder()
   {
      return new PolicyHolder(policyHolder.getFirstName(), policyHolder.getLastName(),
                              policyHolder.getAge(), policyHolder.getSmokingStatus(),
                              policyHolder.getHeight(), policyHolder.getWeight());
   }

   public static int getPolicyCount()
   {
      return policyCount;
   }

   public void setPolicyNumber(int policyNumber)
   {
      this.policyNumber = policyNumber;
   }

   public void setProviderName(String providerName)
   {
      this.providerName = providerName;
   }

   public void setPolicyHolder(PolicyHolder policyHolder)
   {
      this.policyHolder = new PolicyHolder(policyHolder.getFirstName(), policyHolder.getLastName(),
                                           policyHolder.getAge(), policyHolder.getSmokingStatus(),
                                           policyHolder.getHeight(), policyHolder.getWeight());
   }

   public String toString()
   {
      return "Policy Number: " + policyNumber +
             "\nProvider Name: " + providerName +
             "\n" + policyHolder +
             String.format("\nPolicy Price: $%.2f", calculatePolicyPrice());
   }
}
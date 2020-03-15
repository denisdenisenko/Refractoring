
public class Class1 {	
        public double Calculate(double amount, int type, int years)
        {
            double priceAfterDiscount = 0;
            double disc = (years > 5) ? (double)5 / 100 : (double)years / 100;
            if (type == 1)
            {
                priceAfterDiscount = amount;
            }
            else if (type == 2)
            {
                priceAfterDiscount = (amount - (0.1f * amount)) - disc * (amount - (0.1f * amount));
            }
            else if (type == 3)
            {
                priceAfterDiscount = (0.7f * amount) - disc * (0.7f * amount);
            }
            else if (type == 4)
            {
                priceAfterDiscount = (amount - (0.5f * amount)) - disc * (amount - (0.5f * amount));
            }
            return priceAfterDiscount;

        }
}

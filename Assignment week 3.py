def calculate_discount(price, discount_percent):
    """
    Calculates the final price after applying the discount if the discount is 20% or more.
    
    Parameters:
    price (float): Original price of the item.
    discount_percent (float): Discount percentage to be applied.
    
    Returns:
    float: Final price after discount, or original price if discount is less than 20%.
    """
    if discount_percent >= 20:
        discount_amount = price * (discount_percent / 100)
        return price - discount_amount
    else:
        return price

# Get input from the user
try:
    original_price = float(input("Enter the original price of the item: "))
    discount = float(input("Enter the discount percentage: "))

    final_price = calculate_discount(original_price, discount)

    if discount >= 20:
        print(f"Discount applied. Final price: ${final_price:.2f}")
    else:
        print(f"No discount applied. Final price: ${final_price:.2f}")

except ValueError:
    print("Please enter valid numbers for price and discount percentage.")

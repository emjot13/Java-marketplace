A program that models the following market situation:

- Sellers have a limited number of products per unit of time, 
	which they offer on the free market at prices that depend on:
    - the cost of producing the product
    - inflation (the value of money decreases over time)
    - margin (how much the seller wants to earn on the product).
The seller's goal is to make as much profit as possible.

- Buyers have needs, rules and money. 
    They observe product offers on the market. Their behavior is described by the following rules:
    - they want to buy certain products and track their prices but do not need to buy them immediately
    - they have knowledge of the scale of inflation
    - their willingness to buy a product decreases as the price of the product increases, 
	regardless of whether the price increase was due to inflation or margin.
    
- The Central Bank observes the increase in product prices and turnover in the market.
    It sets the current level of inflation. The bank tries to keep tax revenues constant, calculated as the 
    the product of inflation and turnover at a given inflation rate.
    
    
 Use:
- Visitor pattern to update product data at vendors and buyer parameters.
- Observer pattern to passively observe the following changes:
    - Sellers and Buyers watch the Central Bank to find out what the inflation rate is.
    - Buyers observe Sellers' offers and may or may not react to them
	- The Central Bank watches Sellers and Buyers to adjust the inflationary algorithm that keeps 
	constant tax revenues.
  
The turn-based game implemented should stabilize after many turns at the levels targeted by each group of participants.
	
NOT FULLY FINISHED

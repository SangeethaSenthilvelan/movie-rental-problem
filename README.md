Removed the below code smell:

1) Bloaters -- problem -----Long Method/Large Class------ The summary() method of the class Customer was too long and clumsy without a single purpose
Soultion - Added separate single responsible and meaniful new methods as follows:
getTotalRentalAmount()
getFrequentRenterPoint()

2) Bloaters ---- problem-- Primitive Obsession  ---Use of constants for coding information/complicated data is coded in variables ---Movie class - priceCode type (0,1,2)
 
Soultion - Replace Type Code with Class/Replace Type Code with Subclasses.Added interface and subclasses as below:
Movie - Interface
Regular,NewRelease,Children  - subclasses

3) Bloaters ---- problem ----Data Clumps -- The summary method had the logic to calculate the individual rental amount and frequent renter points for each rental record.
Solution - Moved the rental amount calculation& frequent renter points logic to Rental class instead of customer class.
Rental class with new/moved logic methods:
calculateFrequentRenterPoints()
calculateRentAmount()

4) Object-Orientation Abusers - problem - Temporary Field - Unnecssary temp variables used in summary() method of customer class.
Solution - Moved the logic to relavant class Rental.

calculateFrequentRenterPoints()
calculateRentAmount()

5) Object-Orientation Abusers - problem - Switch Statements - Switch case logic was removed from the summary()method of customer class.
Solution - Replace Type Code with Subclasses/Replace Conditional with Polymorphism/ Use Inheritance OOPs concept

Movie - Interface
Regular,NewRelease,Children  - subclasses and moved the logic accordingly.

6)Change Preventers---problem ---Divergent Change --- Summary() method of Customer class was performing unrelavant logic.

Solution: use inheritance (Extract Superclass and Extract Subclass).


Movie - Interface
Regular,NewRelease,Children  - subclasses and moved the logic accordingly.

7) Change Preventers---problem ---Shotgun Surgery ---same as problem 6.

8) Dispensables ---problem ---Comments --Comments were there in Customer class.

Solution: Removed all the comments and made the methods descriptive- Self-explainatory methods.


9) Dispensables ---problem ---Duplicate Code--Duplicate Code in summary() method in Customer class.

Solution: Removed all duplicate code and moved the resonsiblity as required to other classes.

10)
Couplers ----problem ---- Feature Envy ---customer class was using lot of data from Rental & movie class.
Solution: Moved the respective operation to the Rental class for calculation on the frequency renter points and rental amount.

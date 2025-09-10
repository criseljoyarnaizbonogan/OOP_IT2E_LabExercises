 <<entity>> 
    User 
 -name : String 
 -phone : String 
 -address : String 
 -energyType : String  
 +register() 
 +updateProfile() 
 +viewUsage() 


<<entity>>       
EnergySystem  
-id: int
-type : String
-status : String 
-powerOutput : double
+install ()
+monitor ()
+repair ()


<<entity>>
Payment
-transactionId: String
-amount: double
-date: date
-method: String
+makePayment ()
+refund ()
+getReceipt ()


<<entity>
Location
-region: String
-coordination: Point
+trackAccess ()


 EnergySource    
- name: String                   
- capacity_kwh: double           
- location: String               
- isActive: boolean 
+ EnergySource()                
+ EnergySource(name, capacity,location)         
+ generateEnergy(): double       
+ get_status(): String           
+ activate(): void               
+ deactivate(): void 

SolarPanel 
- panelEfficiency: double
+ SolarPanel()                   
+ SolarPanel(name, capacity, location, eff)      
+ generateEnergy(hours): double

RooftopSolarPanel    
- roofTiltAngle: double          
- shadingFactor: double  
"+ RooftopSolarPanel()            
+ RooftopSolarPanel(name, cap, loc, eff,tilt, shade)
+ generateEnergy(): double  

SolarCanopy  
- coverageArea: double           
- connectedDevices: int   
+ SolarCanopy()                  
+ SolarCanopy(name, cap, loc, area, devices)     
+ generateEnergy(): double  

 WindTurbine 
- avgWindSpeed_kmh: double 
+ WindTurbine() 
+ WindTurbine(name, capacity, location, speed)   + generateEnergy(condition): double                  "

UrbanVerticalAxisWindTurbine(VAWT)    
- noiseLevel: double             
- birdSafetyRating: int  
+ UrbanVerticalAxisWindTurbine() 
+UrbanVerticalAxisWindTurbine(name, cap, loc, speed, noise, rate)
+ generateEnergy(): double 

SmallCommunityWindMill  
- manualMaintenance: boolean     
- localMaterialsUsed: boolean 
+ SmallCommunityWindMill()       
+ SmallCommunityWindMill(name, cap, loc, speed) 
+ generateEnergy(): double  

OffshoreWindTurbine     
- foundationType: String         
- maintenanceInterval: int  
+ OffshoreWindTurbine()          
+ OffshoreWindTurbine(name, cap, loc, speed, found, maint)
+ generateEnergy(): double 

 HydroGenerator      
- waterFlowRate_lps: double 
+ HydroGenerator()               
+ HydroGenerator(name, capacity, location, flow) 
+ generateEnergy(rainfall): double    

PicoHydroGenerator   
- streamWidth: double            
- headHeight: double  
+ PicoHydroGenerator()           
+ PicoHydroGenerator(name, cap, loc, flow, width, head)
+ generateEnergy(): double

HydroPumpStorageUnit 
- pumpingCapacity: double        
- storageTankVolume: double 
+ HydroPumpStorageUnit()         
+ HydroPumpStorageUnit(name, cap, loc, flow, pumpCap, ankVol)  
+ generateEnergy(): double  

FloatingSolarFarm   
- waterSurfaceArea: double       
- coolingEffect: double  
+ FloatingSolarFarm()            
+ FloatingSolarFarm(name, cap, loc, area)   
+ generateEnergy(): double 

 Run-of-RiverMicroHydro 
- channelLength: double          
- environmentalImpact: String
+ Run-of-RiverMicroHydro()       
+ Run-of-RiverMicroHydro(name, cap, loc, flow, length)
+ generateEnergy(): double  


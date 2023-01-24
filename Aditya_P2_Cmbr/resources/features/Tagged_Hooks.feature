Feature: Cleartrip Product

	@SmokeTest
	Scenario:  FlightSearch
		Given url flights page
		
	@Reg
	Scenario:  TrainsSearch
		Given url trins page
		
	@SmokeTest
	Scenario:  PakageSearch
		Given url packages page
		
	@PeformanceTest
	Scenario:  SearchForBus
		Given url BUS page
		
			
	@Reg @smokeTest
	Scenario:  SearchForCar
		Given url Cars page
		
			
	@PeformanceTest
	Scenario:  SearchForProduct
		Given url Product page	
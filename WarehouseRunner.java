public class WarehouseRunner
{
	public static void main(String[] args)
	{
		System.out.println("Warehouse Details");		
		Warehouse.getWarehouseId();
		Warehouse.getLocation();
		Warehouse.getCapacity();
		Warehouse.getCurrentInventory();
		Warehouse.getManager();
	}
}
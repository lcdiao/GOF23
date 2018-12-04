package 创建型模式.建造者模式;

public interface AirShipBuilder {
	Engine builderEngine();
	OrbitalModule builderOrbitalModule();
	EscapeTower builderEscapeTower();
}

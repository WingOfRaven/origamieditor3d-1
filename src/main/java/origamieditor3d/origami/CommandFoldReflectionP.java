package origamieditor3d.origami;

public class CommandFoldReflectionP extends CommandFold {
	
	int polygonIndex;
	
	static {
		foldId = 3;
	}
	public CommandFoldReflectionP(double[] ppoint, double[] pnormal, int polygonIndex, OrigamiGen1 origami) {

		this.ppoint = ppoint;
		this.pnormal = pnormal;
		this.origami = origami;
		this.polygonIndex = polygonIndex;

	}
	
	public void execute() {
		origami.internalReflectionFold(ppoint, pnormal, polygonIndex);
	}
	public void undo() {}
	
	@Override
	public int getPolygonIndex() {
		return this.polygonIndex;
	}

}


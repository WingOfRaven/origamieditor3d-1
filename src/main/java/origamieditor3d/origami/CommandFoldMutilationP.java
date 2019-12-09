package origamieditor3d.origami;

public class CommandFoldMutilationP extends CommandFold {
	
	int polygonIndex;
	
	static {
		foldId = 7;
	}
	public CommandFoldMutilationP(double[] ppoint, double[] pnormal, int polygonIndex, OrigamiGen1 origami) {

		this.ppoint = ppoint;
		this.pnormal = pnormal;
		this.polygonIndex = polygonIndex;
		this.origami = origami;

	}
	
	public void execute() {
		origami.internalMutilation(ppoint, pnormal, polygonIndex);
	}
	public void undo() {}
	
	@Override
	public int getPolygonIndex() {
		return this.polygonIndex;
		
	}

}

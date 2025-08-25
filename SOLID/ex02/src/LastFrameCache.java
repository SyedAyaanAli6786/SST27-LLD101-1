public class LastFrameCache implements Cache {
    private Frame last;

    @Override
    public void save(Frame frame) {
        this.last = frame;
    }

    @Override
    public boolean isCached() {
        return last != null;
    }
}

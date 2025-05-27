package ro.ase.cts;

abstract class URLCheck {
    protected URLCheck next;

    public URLCheck linkWith(URLCheck next) {
        this.next = next;
        return next;
    }

    public void check(String url) {
        if (next != null) next.check(url);
    }
}

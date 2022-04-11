class Page {
	private int view = 20;
	 private int startPage;
	 private int endPage;
	
	Page(int page) {
		this.startPage = (page * view) - view + 1;
		this.endPage = page * view;
	}

	public int getView() {
		return view;
	}

	public void setView(int view) {
		this.view = view;
	}

	public int getStartPage() {
		return startPage;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	public int getEndPage() {
		return endPage;
	}

	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}
	
	
	
}
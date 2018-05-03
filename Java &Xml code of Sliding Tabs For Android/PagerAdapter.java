
public class PagerAdapter extends FragmentStatePagerAdapter {
    int mNoOfTabs;
    public PagerAdapter(FragmentManager fm, int NumberofTabs){
        super(fm);
        this.mNoOfTabs = NumberofTabs;
    }
    @Override
    public android.support.v4.app.Fragment getItem(int position) {
        switch (position) {
            case 0:
                Tab1 tab1 = new Tab1();
                return tab1;
            case 1:
                Tab2 tab2=new Tab2();
                return tab2;
            case 2:
                Tab3 tab3=new Tab3();
                return tab3;
            default:
                return  null;
        }
    }

    @Override
    public int getCount() {
        return mNoOfTabs;
    }
}
/***************************************************************
 * file: ScoreObject.java
 * author: E. Lee, D. Nyugen, S. Lee, H. Bozawglanian, J. Canalita
 * class: CS 245 – Programming Graphical User Interfaces
 *
 * assignment: Android App
 * date last modified: 3/07/2017
 *
 * purpose: This enum contains every layout for each game
 *          difficulty.
 *
 ****************************************************************/

package cs245.concentration.Game;

import cs245.concentration.R;

enum ScoreObject {

    FOUR(R.string.four, R.layout.score_4),
    SIX(R.string.six, R.layout.score_6),
    EIGHT(R.string.eight, R.layout.score_8),
    TEN(R.string.ten, R.layout.score_10),
    TWELVE(R.string.twelve, R.layout.score_12),
    FOURTEEN(R.string.fourteen, R.layout.score_14),
    SIXTEEN(R.string.sixteen, R.layout.score_16),
    EIGHTEEN(R.string.eighteen, R.layout.score_18),
    TWENTY(R.string.twenty, R.layout.score_20);

    private int mTitleResId;
    private int mLayoutResId;

    // method: ScoreObject
    // purpose: this method acts as the class constructor.
    ScoreObject(int titleResId, int layoutResId) {
        mTitleResId = titleResId;
        mLayoutResId = layoutResId;
    }

    // method: getTitleResId
    // purpose: this method returns the resource id of the current view.
    public int getTitleResId() {
        return mTitleResId;
    }

    // method: getLayoutResId
    // purpose: this method returns the layout id of the current view.
    public int getLayoutResId() {
        return mLayoutResId;
    }

}

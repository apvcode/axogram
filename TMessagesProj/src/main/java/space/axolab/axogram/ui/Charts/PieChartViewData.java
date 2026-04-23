package space.axolab.axogram.ui.Charts;

import android.animation.Animator;

import space.axolab.axogram.ui.Charts.data.ChartData;
import space.axolab.axogram.ui.Charts.view_data.StackLinearViewData;

public class PieChartViewData extends StackLinearViewData {

    float selectionA;
    float drawingPart;
    Animator animator;

    public PieChartViewData(ChartData.Line line) {
        super(line);
    }
}

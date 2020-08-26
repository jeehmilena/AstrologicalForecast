package com.example.kosmos.chooseyoursign.view

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView

class GridItemDecoration(gridSpacingPx: Int, gridSize: Int) : RecyclerView.ItemDecoration() {
    private var sizedGridSpacing: Int = gridSpacingPx
    private var gridSized: Int = gridSize
    private var needLeftSpacing = false

    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        val frameWidth =
            ((parent.width - sizedGridSpacing.toFloat() * (gridSized - 1)) / gridSized).toInt()
        val padding = parent.width / gridSized - frameWidth
        val itemPosition = (view.layoutParams as RecyclerView.LayoutParams).viewAdapterPosition
        if (itemPosition < gridSized) {
            outRect.top = 0
        } else {
            outRect.top = sizedGridSpacing
        }
        if (itemPosition % gridSized == 0) {
            outRect.left = 0
            outRect.right = padding
            needLeftSpacing = false
        } else if ((itemPosition + 1) % gridSized == 0) {
            needLeftSpacing = false
            outRect.right = 0
            outRect.left = padding

        } else if (needLeftSpacing) {
            needLeftSpacing = false
            outRect.left = sizedGridSpacing - padding
            if ((itemPosition + 2) % gridSized == 0) {
                outRect.right = sizedGridSpacing - padding
            } else {
                outRect.right = sizedGridSpacing / 2

            }
        } else if ((itemPosition + 2) % gridSized == 0) {
            needLeftSpacing = false
            outRect.left = sizedGridSpacing / 2
            outRect.right = sizedGridSpacing - padding
        } else {
            needLeftSpacing = false
            outRect.left = sizedGridSpacing / 2
            outRect.right = sizedGridSpacing / 2

        }
        outRect.bottom = 0
    }

}
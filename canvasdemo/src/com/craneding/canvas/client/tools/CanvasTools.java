/**
 * 
 */
package com.craneding.canvas.client.tools;

import com.craneding.canvas.client.ui.CanvasContext;

/**
 * @author 丁丁
 * 
 */
public abstract class CanvasTools {

	public static class CanvasApp {
		public CanvasContext ctx;
		public int width;
		public int height;
		public boolean ctrl;
		public String rgba;

		public CanvasApp(CanvasContext ctx, int width, int height) {
			this.ctx = ctx;
			this.width = width;
			this.height = height;
		}
	}

	protected final CanvasApp app;

	public CanvasTools(CanvasApp app) {
		this.app = app;
	}

	public CanvasTools LineWidth(int lineWidth) {
		app.ctx.fillStyle(app.rgba);
		app.ctx.lineWidth(lineWidth);
		return this;
	}

	public CanvasTools Color(String color) {
		app.ctx.strokeStyle(color);
		return this;
	}

	public CanvasTools clear() {
		app.ctx.clearRect(0, 0, app.width, app.height);
		return this;
	}
}

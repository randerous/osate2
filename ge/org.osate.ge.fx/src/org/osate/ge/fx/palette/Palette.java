/**
 * Copyright (c) 2004-2020 Carnegie Mellon University and others. (see Contributors file).
 * All Rights Reserved.
 *
 * NO WARRANTY. ALL MATERIAL IS FURNISHED ON AN "AS-IS" BASIS. CARNEGIE MELLON UNIVERSITY MAKES NO WARRANTIES OF ANY
 * KIND, EITHER EXPRESSED OR IMPLIED, AS TO ANY MATTER INCLUDING, BUT NOT LIMITED TO, WARRANTY OF FITNESS FOR PURPOSE
 * OR MERCHANTABILITY, EXCLUSIVITY, OR RESULTS OBTAINED FROM USE OF THE MATERIAL. CARNEGIE MELLON UNIVERSITY DOES NOT
 * MAKE ANY WARRANTY OF ANY KIND WITH RESPECT TO FREEDOM FROM PATENT, TRADEMARK, OR COPYRIGHT INFRINGEMENT.
 *
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * SPDX-License-Identifier: EPL-2.0
 *
 * Created, in part, with funding and support from the United States Government. (see Acknowledgments file).
 *
 * This program includes and/or can make use of certain third party source code, object code, documentation and other
 * files ("Third Party Software"). The Third Party Software that is used by this program is dependent upon your system
 * configuration. By using this program, You agree to comply with any and all relevant Third Party Software terms and
 * conditions contained in any such Third Party Software or separate license file distributed with such Third Party
 * Software. The parties who own the Third Party Software ("Third Party Licensors") are intended third party benefici-
 * aries to this license with respect to the terms applicable to their Third Party Software. Third Party Software li-
 * censes only apply to the Third Party Software and not any other portion of this program or this program as a whole.
 */
package org.osate.ge.fx.palette;

import java.util.ArrayList;
import java.util.Objects;

import org.osate.ge.fx.NodeApplication;

import javafx.scene.Node;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;

/**
 * Generic palette component.
 *
 */
public class Palette extends Region {
	private PaletteModelController mc;

	VBox paletteVbox = new VBox();
	ArrayList<PaletteGroup> paletteList = new ArrayList<PaletteGroup>();

	public Palette(final PaletteModelController mc) {
		this.mc = Objects.requireNonNull(mc, "mc must not be null");

		// TODO: Create contents based on the model controller

		for (int i = 0; i < mc.getNumberOfGroups(); i++) {
			// TODO: Move into PaletteGroup
			// TODO: Create a palette group for each group
			// TODO: Add each palette to a list
			// TODO: Listen for change to expanded property. When it is set, adjust expanded state of other

			PaletteGroup paletteGroup = new PaletteGroup(mc, i);
			paletteList.add(paletteGroup);
			paletteVbox.getChildren().add(paletteList.get(i));
		}

		/*
		 * This should add all paletteGroups into a list which is then put into a VBox containing
		 * all the paletteGroup instances. That VBox is then added to the palette.
		 * In theory, taking these steps should create a visible output when the code is run,
		 * however all that happens is a blank screen.
		 */
		// TODO Discover why the above statement is true.

		this.getChildren().add(paletteVbox);
	}

	@Override
	public void layoutChildren() {
		// TODO: Replace with something that sizes and positions children appropriately.
		super.layoutChildren();
	}

	public static void main(final String[] args) {
		NodeApplication.run(() -> new Node[] { new Palette(new TestPaletteModelController()) });
	}

}
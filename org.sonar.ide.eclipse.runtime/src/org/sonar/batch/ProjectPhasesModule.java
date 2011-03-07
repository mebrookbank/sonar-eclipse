/*
 * Sonar, open source software quality management tool.
 * Copyright (C) 2010-2011 SonarSource
 * mailto:contact AT sonarsource DOT com
 *
 * Sonar is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * Sonar is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with Sonar; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02
 */
package org.sonar.batch;

import org.sonar.batch.components.EmbedderPhases;
import org.sonar.batch.components.Mocks;

import org.sonar.batch.Module;
import org.sonar.batch.phases.DecoratorsExecutor;
import org.sonar.batch.phases.InitializersExecutor;
import org.sonar.batch.phases.SensorsExecutor;

public class ProjectPhasesModule extends Module {

  @Override
  protected void configure() {
    addComponent(Mocks.createMemoryOptimizer());
    addComponent(InitializersExecutor.class);
    addComponent(SensorsExecutor.class);
    addComponent(DecoratorsExecutor.class);
    addComponent(EmbedderPhases.class);
  }

}
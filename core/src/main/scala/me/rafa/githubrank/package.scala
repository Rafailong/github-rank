package me.rafa

import sttp.capabilities.WebSockets
import sttp.capabilities.zio.ZioStreams
import sttp.client3.SttpBackend
import zio.Task

package object githubrank {

  type ZioSttpBackend = SttpBackend[Task, ZioStreams with WebSockets]
}

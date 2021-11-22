package me.rafa.githubrank.caching

import me.rafa.githubrank.Error
import me.rafa.githubrank.model.Contributor
import scalacache.Flags
import zio._

trait ZCache {

  def putWithExpiration(key: String)(contributors: Set[Contributor])(implicit
    flags: Flags
  ): IO[Error, Unit]

  def get(key: String)(implicit flags: Flags): IO[Error, Option[Set[Contributor]]]
}

object ZCache {

  def putWithExpiration(key: String)(contributors: Set[Contributor])(implicit
    flags: Flags
  ): ZIO[Has[ZCache], Error, Unit] =
    ZIO.serviceWith[ZCache](_.putWithExpiration(key)(contributors))

  def get(key: String)(implicit
    flags: Flags
  ): ZIO[Has[ZCache], Error, Option[Set[Contributor]]] =
    ZIO.serviceWith[ZCache](_.get(key))
}

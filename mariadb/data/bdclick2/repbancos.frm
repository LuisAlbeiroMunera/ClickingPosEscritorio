TYPE=VIEW
query=(select `bdclick2`.`bdmovimientosbancos`.`Id` AS `Id`,`bdclick2`.`bdmovimientosbancos`.`cuenta` AS `cuenta`,`bdclick2`.`bdmovimientosbancos`.`numero` AS `numero`,`bdclick2`.`bdmovimientosbancos`.`saldoActual` AS `saldoActual`,`bdclick2`.`bdmovimientosbancos`.`valorMovimiento` AS `valorMovimiento`,`bdclick2`.`bdmovimientosbancos`.`saldoFinal` AS `saldoFinal`,`bdclick2`.`bdmovimientosbancos`.`nota` AS `nota`,`bdclick2`.`bdmovimientosbancos`.`usuario` AS `usuario`,`bdclick2`.`bdmovimientosbancos`.`fecha` AS `fecha`,`bdclick2`.`bdmovimientosbancos`.`tipo` AS `tipo`,`bdclick2`.`bdmovimientosbancos`.`hora` AS `hora`,`bdclick2`.`bdmovimientosbancos`.`nombreDoc` AS `nombreDoc` from `bdclick2`.`bdmovimientosbancos` group by `bdclick2`.`bdmovimientosbancos`.`Id`,`bdclick2`.`bdmovimientosbancos`.`cuenta`,`bdclick2`.`bdmovimientosbancos`.`numero`,`bdclick2`.`bdmovimientosbancos`.`saldoActual`,`bdclick2`.`bdmovimientosbancos`.`valorMovimiento`,`bdclick2`.`bdmovimientosbancos`.`saldoFinal`,`bdclick2`.`bdmovimientosbancos`.`nota`,`bdclick2`.`bdmovimientosbancos`.`usuario`,`bdclick2`.`bdmovimientosbancos`.`fecha`,`bdclick2`.`bdmovimientosbancos`.`tipo`,`bdclick2`.`bdmovimientosbancos`.`hora`,`bdclick2`.`bdmovimientosbancos`.`nombreDoc`)
md5=d69478461f2042ef8065b4bb8a7be400
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:47
create-version=2
source=(select `bdmovimientosbancos`.`Id` AS `Id`,`bdmovimientosbancos`.`cuenta` AS `cuenta`,`bdmovimientosbancos`.`numero` AS `numero`,`bdmovimientosbancos`.`saldoActual` AS `saldoActual`,`bdmovimientosbancos`.`valorMovimiento` AS `valorMovimiento`,`bdmovimientosbancos`.`saldoFinal` AS `saldoFinal`,`bdmovimientosbancos`.`nota` AS `nota`,`bdmovimientosbancos`.`usuario` AS `usuario`,`bdmovimientosbancos`.`fecha` AS `fecha`,`bdmovimientosbancos`.`tipo` AS `tipo`,`bdmovimientosbancos`.`hora` AS `hora`,`bdmovimientosbancos`.`nombreDoc` AS `nombreDoc` from `bdmovimientosbancos` group by `bdmovimientosbancos`.`Id`,`bdmovimientosbancos`.`cuenta`,`bdmovimientosbancos`.`numero`,`bdmovimientosbancos`.`saldoActual`,`bdmovimientosbancos`.`valorMovimiento`,`bdmovimientosbancos`.`saldoFinal`,`bdmovimientosbancos`.`nota`,`bdmovimientosbancos`.`usuario`,`bdmovimientosbancos`.`fecha`,`bdmovimientosbancos`.`tipo`,`bdmovimientosbancos`.`hora`,`bdmovimientosbancos`.`nombreDoc`)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick2`.`bdmovimientosbancos`.`Id` AS `Id`,`bdclick2`.`bdmovimientosbancos`.`cuenta` AS `cuenta`,`bdclick2`.`bdmovimientosbancos`.`numero` AS `numero`,`bdclick2`.`bdmovimientosbancos`.`saldoActual` AS `saldoActual`,`bdclick2`.`bdmovimientosbancos`.`valorMovimiento` AS `valorMovimiento`,`bdclick2`.`bdmovimientosbancos`.`saldoFinal` AS `saldoFinal`,`bdclick2`.`bdmovimientosbancos`.`nota` AS `nota`,`bdclick2`.`bdmovimientosbancos`.`usuario` AS `usuario`,`bdclick2`.`bdmovimientosbancos`.`fecha` AS `fecha`,`bdclick2`.`bdmovimientosbancos`.`tipo` AS `tipo`,`bdclick2`.`bdmovimientosbancos`.`hora` AS `hora`,`bdclick2`.`bdmovimientosbancos`.`nombreDoc` AS `nombreDoc` from `bdclick2`.`bdmovimientosbancos` group by `bdclick2`.`bdmovimientosbancos`.`Id`,`bdclick2`.`bdmovimientosbancos`.`cuenta`,`bdclick2`.`bdmovimientosbancos`.`numero`,`bdclick2`.`bdmovimientosbancos`.`saldoActual`,`bdclick2`.`bdmovimientosbancos`.`valorMovimiento`,`bdclick2`.`bdmovimientosbancos`.`saldoFinal`,`bdclick2`.`bdmovimientosbancos`.`nota`,`bdclick2`.`bdmovimientosbancos`.`usuario`,`bdclick2`.`bdmovimientosbancos`.`fecha`,`bdclick2`.`bdmovimientosbancos`.`tipo`,`bdclick2`.`bdmovimientosbancos`.`hora`,`bdclick2`.`bdmovimientosbancos`.`nombreDoc`)
mariadb-version=100135
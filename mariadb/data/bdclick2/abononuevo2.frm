TYPE=VIEW
query=(select `abononuevo`.`id` AS `id`,`abononuevo`.`fecha` AS `fecha`,`abononuevo`.`nombre` AS `nombre`,`abononuevo`.`cliente` AS `cliente`,`abononuevo`.`numFactura` AS `numFactura`,`abononuevo`.`totalFactura` AS `totalFactura`,`abononuevo`.`comprobante` AS `comprobante`,`abononuevo`.`abonoActual` AS `abonoActual`,`abononuevo`.`abonoLetras` AS `abonoLetras`,`abononuevo`.`abonosAnteriores` AS `abonosAnteriores`,`abononuevo`.`cheque` AS `cheque`,`abononuevo`.`targeta` AS `targeta`,`abononuevo`.`efectivo` AS `efectivo`,`abononuevo`.`nc` AS `nc`,`abononuevo`.`rtIva` AS `rtIva`,`abononuevo`.`rtIca` AS `rtIca`,`abononuevo`.`rtFuente` AS `rtFuente`,`abononuevo`.`otros` AS `otros`,`abononuevo`.`abonoGeneral` AS `abonoGeneral`,`abononuevo`.`saldoTotalGeneral` AS `saldoTotalGeneral`,`abononuevo`.`valorGeneral` AS `valorGeneral`,`abononuevo`.`enLetra` AS `enLetra`,`abononuevo`.`saldoFaltante` AS `saldoFaltante`,`bdclick2`.`conprestamo`.`numCuota` AS `numCuota`,`bdclick2`.`conprestamo`.`fechaCuota` AS `fechaCuota`,`bdclick2`.`conprestamo`.`abonoCapital` AS `abonoCapital`,`bdclick2`.`conprestamo`.`abonoInteres` AS `abonoInteres`,`bdclick2`.`conprestamo`.`totalCuota` AS `totalCuota`,`bdclick2`.`conprestamo`.`mora` AS `mora`,`bdclick2`.`conprestamo`.`totalAbono` AS `totalAbono`,if((`bdclick2`.`conprestamo`.`totalAbono` = 0),\'PENDIENTE\',\'PAGADA\') AS `Estado` from (`bdclick2`.`abononuevo` join `bdclick2`.`conprestamo` on((`abononuevo`.`numFactura` = `bdclick2`.`conprestamo`.`factura`))) group by `abononuevo`.`id`,`abononuevo`.`fecha`,`abononuevo`.`nombre`,`abononuevo`.`cliente`,`abononuevo`.`numFactura`,`abononuevo`.`totalFactura`,`abononuevo`.`comprobante`,`abononuevo`.`abonoActual`,`abononuevo`.`abonoLetras`,`abononuevo`.`abonosAnteriores`,`abononuevo`.`cheque`,`abononuevo`.`targeta`,`abononuevo`.`efectivo`,`abononuevo`.`nc`,`abononuevo`.`rtIva`,`abononuevo`.`rtIca`,`abononuevo`.`rtFuente`,`abononuevo`.`otros`,`abononuevo`.`abonoGeneral`,`abononuevo`.`saldoTotalGeneral`,`abononuevo`.`valorGeneral`,`abononuevo`.`saldoFaltante`,`bdclick2`.`conprestamo`.`numCuota`,`bdclick2`.`conprestamo`.`fechaCuota`,`bdclick2`.`conprestamo`.`abonoCapital`,`bdclick2`.`conprestamo`.`abonoInteres`,`bdclick2`.`conprestamo`.`totalCuota`,`bdclick2`.`conprestamo`.`mora`,`bdclick2`.`conprestamo`.`totalAbono`,if((`bdclick2`.`conprestamo`.`totalAbono` = 0),\'PENDIENTE\',\'PAGADA\'))
md5=19eb6d1f4cdf39e3baa05754d358b95a
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:42
create-version=2
source=(select `abononuevo`.`id` AS `id`,`abononuevo`.`fecha` AS `fecha`,`abononuevo`.`nombre` AS `nombre`,`abononuevo`.`cliente` AS `cliente`,`abononuevo`.`numFactura` AS `numFactura`,`abononuevo`.`totalFactura` AS `totalFactura`,`abononuevo`.`comprobante` AS `comprobante`,`abononuevo`.`abonoActual` AS `abonoActual`,`abononuevo`.`abonoLetras` AS `abonoLetras`,`abononuevo`.`abonosAnteriores` AS `abonosAnteriores`,`abononuevo`.`cheque` AS `cheque`,`abononuevo`.`targeta` AS `targeta`,`abononuevo`.`efectivo` AS `efectivo`,`abononuevo`.`nc` AS `nc`,`abononuevo`.`rtIva` AS `rtIva`,`abononuevo`.`rtIca` AS `rtIca`,`abononuevo`.`rtFuente` AS `rtFuente`,`abononuevo`.`otros` AS `otros`,`abononuevo`.`abonoGeneral` AS `abonoGeneral`,`abononuevo`.`saldoTotalGeneral` AS `saldoTotalGeneral`,`abononuevo`.`valorGeneral` AS `valorGeneral`,`abononuevo`.`enLetra` AS `enLetra`,`abononuevo`.`saldoFaltante` AS `saldoFaltante`,`conprestamo`.`numCuota` AS `numCuota`,`conprestamo`.`fechaCuota` AS `fechaCuota`,`conprestamo`.`abonoCapital` AS `abonoCapital`,`conprestamo`.`abonoInteres` AS `abonoInteres`,`conprestamo`.`totalCuota` AS `totalCuota`,`conprestamo`.`mora` AS `mora`,`conprestamo`.`totalAbono` AS `totalAbono`,if((`conprestamo`.`totalAbono` = 0),\'PENDIENTE\',\'PAGADA\') AS `Estado` from (`abononuevo` join `conprestamo` on((`abononuevo`.`numFactura` = `conprestamo`.`factura`))) group by `abononuevo`.`id`,`abononuevo`.`fecha`,`abononuevo`.`nombre`,`abononuevo`.`cliente`,`abononuevo`.`numFactura`,`abononuevo`.`totalFactura`,`abononuevo`.`comprobante`,`abononuevo`.`abonoActual`,`abononuevo`.`abonoLetras`,`abononuevo`.`abonosAnteriores`,`abononuevo`.`cheque`,`abononuevo`.`targeta`,`abononuevo`.`efectivo`,`abononuevo`.`nc`,`abononuevo`.`rtIva`,`abononuevo`.`rtIca`,`abononuevo`.`rtFuente`,`abononuevo`.`otros`,`abononuevo`.`abonoGeneral`,`abononuevo`.`saldoTotalGeneral`,`abononuevo`.`valorGeneral`,`abononuevo`.`saldoFaltante`,`conprestamo`.`numCuota`,`conprestamo`.`fechaCuota`,`conprestamo`.`abonoCapital`,`conprestamo`.`abonoInteres`,`conprestamo`.`totalCuota`,`conprestamo`.`mora`,`conprestamo`.`totalAbono`,if((`conprestamo`.`totalAbono` = 0),\'PENDIENTE\',\'PAGADA\'))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `abononuevo`.`id` AS `id`,`abononuevo`.`fecha` AS `fecha`,`abononuevo`.`nombre` AS `nombre`,`abononuevo`.`cliente` AS `cliente`,`abononuevo`.`numFactura` AS `numFactura`,`abononuevo`.`totalFactura` AS `totalFactura`,`abononuevo`.`comprobante` AS `comprobante`,`abononuevo`.`abonoActual` AS `abonoActual`,`abononuevo`.`abonoLetras` AS `abonoLetras`,`abononuevo`.`abonosAnteriores` AS `abonosAnteriores`,`abononuevo`.`cheque` AS `cheque`,`abononuevo`.`targeta` AS `targeta`,`abononuevo`.`efectivo` AS `efectivo`,`abononuevo`.`nc` AS `nc`,`abononuevo`.`rtIva` AS `rtIva`,`abononuevo`.`rtIca` AS `rtIca`,`abononuevo`.`rtFuente` AS `rtFuente`,`abononuevo`.`otros` AS `otros`,`abononuevo`.`abonoGeneral` AS `abonoGeneral`,`abononuevo`.`saldoTotalGeneral` AS `saldoTotalGeneral`,`abononuevo`.`valorGeneral` AS `valorGeneral`,`abononuevo`.`enLetra` AS `enLetra`,`abononuevo`.`saldoFaltante` AS `saldoFaltante`,`bdclick2`.`conprestamo`.`numCuota` AS `numCuota`,`bdclick2`.`conprestamo`.`fechaCuota` AS `fechaCuota`,`bdclick2`.`conprestamo`.`abonoCapital` AS `abonoCapital`,`bdclick2`.`conprestamo`.`abonoInteres` AS `abonoInteres`,`bdclick2`.`conprestamo`.`totalCuota` AS `totalCuota`,`bdclick2`.`conprestamo`.`mora` AS `mora`,`bdclick2`.`conprestamo`.`totalAbono` AS `totalAbono`,if((`bdclick2`.`conprestamo`.`totalAbono` = 0),\'PENDIENTE\',\'PAGADA\') AS `Estado` from (`bdclick2`.`abononuevo` join `bdclick2`.`conprestamo` on((`abononuevo`.`numFactura` = `bdclick2`.`conprestamo`.`factura`))) group by `abononuevo`.`id`,`abononuevo`.`fecha`,`abononuevo`.`nombre`,`abononuevo`.`cliente`,`abononuevo`.`numFactura`,`abononuevo`.`totalFactura`,`abononuevo`.`comprobante`,`abononuevo`.`abonoActual`,`abononuevo`.`abonoLetras`,`abononuevo`.`abonosAnteriores`,`abononuevo`.`cheque`,`abononuevo`.`targeta`,`abononuevo`.`efectivo`,`abononuevo`.`nc`,`abononuevo`.`rtIva`,`abononuevo`.`rtIca`,`abononuevo`.`rtFuente`,`abononuevo`.`otros`,`abononuevo`.`abonoGeneral`,`abononuevo`.`saldoTotalGeneral`,`abononuevo`.`valorGeneral`,`abononuevo`.`saldoFaltante`,`bdclick2`.`conprestamo`.`numCuota`,`bdclick2`.`conprestamo`.`fechaCuota`,`bdclick2`.`conprestamo`.`abonoCapital`,`bdclick2`.`conprestamo`.`abonoInteres`,`bdclick2`.`conprestamo`.`totalCuota`,`bdclick2`.`conprestamo`.`mora`,`bdclick2`.`conprestamo`.`totalAbono`,if((`bdclick2`.`conprestamo`.`totalAbono` = 0),\'PENDIENTE\',\'PAGADA\'))
mariadb-version=100135
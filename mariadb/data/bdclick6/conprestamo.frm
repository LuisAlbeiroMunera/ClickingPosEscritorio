TYPE=VIEW
query=(select `bdclick6`.`bdprestamo`.`contrato` AS `contrato`,`bdclick6`.`bdprestamo`.`factura` AS `factura`,`bdclick6`.`bdprestamo`.`usuario` AS `usuario`,`bdclick6`.`bdprestamo`.`fecha` AS `fecha`,`bdclick6`.`bdprestamo`.`cliente` AS `cliente`,`bdclick6`.`bdprestamo`.`convenio` AS `convenio`,`bdclick6`.`bdprestamo`.`tipoServicio` AS `tipoServicio`,`bdclick6`.`bdprestamo`.`fechaAprovado` AS `fechaAprovado`,`bdclick6`.`bdprestamo`.`fechaDesenvolso` AS `fechaDesenvolso`,`bdclick6`.`bdprestamo`.`observaciones` AS `observaciones`,`bdclick6`.`bdprestamo`.`valorSolicitado` AS `valorSolicitado`,`bdclick6`.`bdprestamo`.`valorAprovado` AS `valorAprovado`,`bdclick6`.`bdprestamo`.`cuotas` AS `cuotas`,`bdclick6`.`bdprestamo`.`interes` AS `interes`,`bdclick6`.`bdprestamo`.`totalInteres` AS `totalInteres`,`bdclick6`.`bdprestamo`.`total` AS `total`,`bdclick6`.`bdcuota`.`numCuota` AS `numCuota`,`bdclick6`.`bdcuota`.`fecha` AS `fechaCuota`,`bdclick6`.`bdcuota`.`fechaAbono` AS `fechaAbono`,`bdclick6`.`bdcuota`.`abonoCapital` AS `abonoCapital`,`bdclick6`.`bdcuota`.`abonoInteres` AS `abonoInteres`,`bdclick6`.`bdcuota`.`total` AS `totalCuota`,`bdclick6`.`bdcuota`.`totalAbono` AS `totalAbono`,`bdclick6`.`bdterceros`.`nombre` AS `nombre`,cast(now() as date) AS `hoy`,`bdclick6`.`bdcuota`.`mora` AS `mora`,`bdclick6`.`bdterceros`.`direccion` AS `direccion`,`bdclick6`.`bdterceros`.`celular` AS `celular`,`bdclick6`.`bdterceros`.`telefono` AS `telefono`,`bdclick6`.`bdprestamo`.`cuotaInicial` AS `cuotaInicial`,`bdclick6`.`bdverificadorfacturas`.`vendedor` AS `vendedor` from (`bdclick6`.`bdverificadorfacturas` join ((`bdclick6`.`bdprestamo` left join `bdclick6`.`bdcuota` on((`bdclick6`.`bdprestamo`.`contrato` = `bdclick6`.`bdcuota`.`contrato`))) left join `bdclick6`.`bdterceros` on((`bdclick6`.`bdprestamo`.`cliente` = `bdclick6`.`bdterceros`.`id`))) on((`bdclick6`.`bdverificadorfacturas`.`idFactura` = `bdclick6`.`bdprestamo`.`factura`))) group by `bdclick6`.`bdprestamo`.`contrato`,`bdclick6`.`bdprestamo`.`factura`,`bdclick6`.`bdprestamo`.`usuario`,`bdclick6`.`bdprestamo`.`fecha`,`bdclick6`.`bdprestamo`.`cliente`,`bdclick6`.`bdprestamo`.`convenio`,`bdclick6`.`bdprestamo`.`tipoServicio`,`bdclick6`.`bdprestamo`.`fechaAprovado`,`bdclick6`.`bdprestamo`.`fechaDesenvolso`,`bdclick6`.`bdprestamo`.`observaciones`,`bdclick6`.`bdprestamo`.`valorSolicitado`,`bdclick6`.`bdprestamo`.`valorAprovado`,`bdclick6`.`bdprestamo`.`cuotas`,`bdclick6`.`bdprestamo`.`interes`,`bdclick6`.`bdprestamo`.`totalInteres`,`bdclick6`.`bdprestamo`.`total`,`bdclick6`.`bdcuota`.`numCuota`,`bdclick6`.`bdcuota`.`fecha`,`bdclick6`.`bdcuota`.`fechaAbono`,`bdclick6`.`bdcuota`.`abonoCapital`,`bdclick6`.`bdcuota`.`abonoInteres`,`bdclick6`.`bdcuota`.`total`,`bdclick6`.`bdcuota`.`totalAbono`,`bdclick6`.`bdterceros`.`nombre`,cast(now() as date),`bdclick6`.`bdcuota`.`mora`,`bdclick6`.`bdterceros`.`direccion`,`bdclick6`.`bdterceros`.`celular`,`bdclick6`.`bdterceros`.`telefono`,`bdclick6`.`bdprestamo`.`cuotaInicial`,`bdclick6`.`bdverificadorfacturas`.`vendedor`)
md5=9135419a8c526093ab785431ca631a40
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:34
create-version=2
source=(select `bdprestamo`.`contrato` AS `contrato`,`bdprestamo`.`factura` AS `factura`,`bdprestamo`.`usuario` AS `usuario`,`bdprestamo`.`fecha` AS `fecha`,`bdprestamo`.`cliente` AS `cliente`,`bdprestamo`.`convenio` AS `convenio`,`bdprestamo`.`tipoServicio` AS `tipoServicio`,`bdprestamo`.`fechaAprovado` AS `fechaAprovado`,`bdprestamo`.`fechaDesenvolso` AS `fechaDesenvolso`,`bdprestamo`.`observaciones` AS `observaciones`,`bdprestamo`.`valorSolicitado` AS `valorSolicitado`,`bdprestamo`.`valorAprovado` AS `valorAprovado`,`bdprestamo`.`cuotas` AS `cuotas`,`bdprestamo`.`interes` AS `interes`,`bdprestamo`.`totalInteres` AS `totalInteres`,`bdprestamo`.`total` AS `total`,`bdcuota`.`numCuota` AS `numCuota`,`bdcuota`.`fecha` AS `fechaCuota`,`bdcuota`.`fechaAbono` AS `fechaAbono`,`bdcuota`.`abonoCapital` AS `abonoCapital`,`bdcuota`.`abonoInteres` AS `abonoInteres`,`bdcuota`.`total` AS `totalCuota`,`bdcuota`.`totalAbono` AS `totalAbono`,`bdterceros`.`nombre` AS `nombre`,cast(now() as date) AS `hoy`,`bdcuota`.`mora` AS `mora`,`bdterceros`.`direccion` AS `direccion`,`bdterceros`.`celular` AS `celular`,`bdterceros`.`telefono` AS `telefono`,`bdprestamo`.`cuotaInicial` AS `cuotaInicial`,`bdverificadorfacturas`.`vendedor` AS `vendedor` from (`bdverificadorfacturas` join ((`bdprestamo` left join `bdcuota` on((`bdprestamo`.`contrato` = `bdcuota`.`contrato`))) left join `bdterceros` on((`bdprestamo`.`cliente` = `bdterceros`.`id`))) on((`bdverificadorfacturas`.`idFactura` = `bdprestamo`.`factura`))) group by `bdprestamo`.`contrato`,`bdprestamo`.`factura`,`bdprestamo`.`usuario`,`bdprestamo`.`fecha`,`bdprestamo`.`cliente`,`bdprestamo`.`convenio`,`bdprestamo`.`tipoServicio`,`bdprestamo`.`fechaAprovado`,`bdprestamo`.`fechaDesenvolso`,`bdprestamo`.`observaciones`,`bdprestamo`.`valorSolicitado`,`bdprestamo`.`valorAprovado`,`bdprestamo`.`cuotas`,`bdprestamo`.`interes`,`bdprestamo`.`totalInteres`,`bdprestamo`.`total`,`bdcuota`.`numCuota`,`bdcuota`.`fecha`,`bdcuota`.`fechaAbono`,`bdcuota`.`abonoCapital`,`bdcuota`.`abonoInteres`,`bdcuota`.`total`,`bdcuota`.`totalAbono`,`bdterceros`.`nombre`,cast(now() as date),`bdcuota`.`mora`,`bdterceros`.`direccion`,`bdterceros`.`celular`,`bdterceros`.`telefono`,`bdprestamo`.`cuotaInicial`,`bdverificadorfacturas`.`vendedor`)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick6`.`bdprestamo`.`contrato` AS `contrato`,`bdclick6`.`bdprestamo`.`factura` AS `factura`,`bdclick6`.`bdprestamo`.`usuario` AS `usuario`,`bdclick6`.`bdprestamo`.`fecha` AS `fecha`,`bdclick6`.`bdprestamo`.`cliente` AS `cliente`,`bdclick6`.`bdprestamo`.`convenio` AS `convenio`,`bdclick6`.`bdprestamo`.`tipoServicio` AS `tipoServicio`,`bdclick6`.`bdprestamo`.`fechaAprovado` AS `fechaAprovado`,`bdclick6`.`bdprestamo`.`fechaDesenvolso` AS `fechaDesenvolso`,`bdclick6`.`bdprestamo`.`observaciones` AS `observaciones`,`bdclick6`.`bdprestamo`.`valorSolicitado` AS `valorSolicitado`,`bdclick6`.`bdprestamo`.`valorAprovado` AS `valorAprovado`,`bdclick6`.`bdprestamo`.`cuotas` AS `cuotas`,`bdclick6`.`bdprestamo`.`interes` AS `interes`,`bdclick6`.`bdprestamo`.`totalInteres` AS `totalInteres`,`bdclick6`.`bdprestamo`.`total` AS `total`,`bdclick6`.`bdcuota`.`numCuota` AS `numCuota`,`bdclick6`.`bdcuota`.`fecha` AS `fechaCuota`,`bdclick6`.`bdcuota`.`fechaAbono` AS `fechaAbono`,`bdclick6`.`bdcuota`.`abonoCapital` AS `abonoCapital`,`bdclick6`.`bdcuota`.`abonoInteres` AS `abonoInteres`,`bdclick6`.`bdcuota`.`total` AS `totalCuota`,`bdclick6`.`bdcuota`.`totalAbono` AS `totalAbono`,`bdclick6`.`bdterceros`.`nombre` AS `nombre`,cast(now() as date) AS `hoy`,`bdclick6`.`bdcuota`.`mora` AS `mora`,`bdclick6`.`bdterceros`.`direccion` AS `direccion`,`bdclick6`.`bdterceros`.`celular` AS `celular`,`bdclick6`.`bdterceros`.`telefono` AS `telefono`,`bdclick6`.`bdprestamo`.`cuotaInicial` AS `cuotaInicial`,`bdclick6`.`bdverificadorfacturas`.`vendedor` AS `vendedor` from (`bdclick6`.`bdverificadorfacturas` join ((`bdclick6`.`bdprestamo` left join `bdclick6`.`bdcuota` on((`bdclick6`.`bdprestamo`.`contrato` = `bdclick6`.`bdcuota`.`contrato`))) left join `bdclick6`.`bdterceros` on((`bdclick6`.`bdprestamo`.`cliente` = `bdclick6`.`bdterceros`.`id`))) on((`bdclick6`.`bdverificadorfacturas`.`idFactura` = `bdclick6`.`bdprestamo`.`factura`))) group by `bdclick6`.`bdprestamo`.`contrato`,`bdclick6`.`bdprestamo`.`factura`,`bdclick6`.`bdprestamo`.`usuario`,`bdclick6`.`bdprestamo`.`fecha`,`bdclick6`.`bdprestamo`.`cliente`,`bdclick6`.`bdprestamo`.`convenio`,`bdclick6`.`bdprestamo`.`tipoServicio`,`bdclick6`.`bdprestamo`.`fechaAprovado`,`bdclick6`.`bdprestamo`.`fechaDesenvolso`,`bdclick6`.`bdprestamo`.`observaciones`,`bdclick6`.`bdprestamo`.`valorSolicitado`,`bdclick6`.`bdprestamo`.`valorAprovado`,`bdclick6`.`bdprestamo`.`cuotas`,`bdclick6`.`bdprestamo`.`interes`,`bdclick6`.`bdprestamo`.`totalInteres`,`bdclick6`.`bdprestamo`.`total`,`bdclick6`.`bdcuota`.`numCuota`,`bdclick6`.`bdcuota`.`fecha`,`bdclick6`.`bdcuota`.`fechaAbono`,`bdclick6`.`bdcuota`.`abonoCapital`,`bdclick6`.`bdcuota`.`abonoInteres`,`bdclick6`.`bdcuota`.`total`,`bdclick6`.`bdcuota`.`totalAbono`,`bdclick6`.`bdterceros`.`nombre`,cast(now() as date),`bdclick6`.`bdcuota`.`mora`,`bdclick6`.`bdterceros`.`direccion`,`bdclick6`.`bdterceros`.`celular`,`bdclick6`.`bdterceros`.`telefono`,`bdclick6`.`bdprestamo`.`cuotaInicial`,`bdclick6`.`bdverificadorfacturas`.`vendedor`)
mariadb-version=100135
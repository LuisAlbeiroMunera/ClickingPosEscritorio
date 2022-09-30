TYPE=VIEW
query=select `bdclick5`.`bdfactura`.`idFactura` AS `idFactura`,`bdclick5`.`bdfactura`.`factura` AS `factura`,`bdclick5`.`bdfactura`.`fechaFactura` AS `fechaFactura`,`bdclick5`.`bdfactura`.`cliente` AS `clienteId`,`bdclick5`.`bdterceros`.`nombre` AS `nombre`,`bdclick5`.`bdfactura`.`vendedor` AS `vendedor`,`bdclick5`.`bdfactura`.`totalGeneral` AS `totalGeneral`,`bdclick5`.`bdfactura`.`terminal` AS `terminal`,`bdclick5`.`bdfactura`.`anulada` AS `anulada`,cast(substr(`bdclick5`.`bdfactura`.`idFactura`,6,100) as signed) AS `ordenId`,`bdclick5`.`bdfactura`.`turno` AS `turno`,`bdclick5`.`bdterceros`.`id` AS `cliente` from (`bdclick5`.`bdfactura` left join `bdclick5`.`bdterceros` on((`bdclick5`.`bdfactura`.`cliente` = `bdclick5`.`bdterceros`.`idSistema`))) group by `bdclick5`.`bdfactura`.`idFactura`,`bdclick5`.`bdfactura`.`factura`,`bdclick5`.`bdfactura`.`fechaFactura`,`bdclick5`.`bdfactura`.`cliente`,`bdclick5`.`bdterceros`.`nombre`,`bdclick5`.`bdfactura`.`vendedor`,`bdclick5`.`bdfactura`.`totalGeneral`,`bdclick5`.`bdfactura`.`terminal`,`bdclick5`.`bdfactura`.`anulada`,cast(substr(`bdclick5`.`bdfactura`.`idFactura`,6,100) as signed),`bdclick5`.`bdfactura`.`turno`,`bdclick5`.`bdterceros`.`id` order by cast(substr(`bdclick5`.`bdfactura`.`idFactura`,6,100) as signed)
md5=fcd03f7d361401df1dbb7dfd78faa93c
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:46
create-version=2
source=select `bdfactura`.`idFactura` AS `idFactura`,`bdfactura`.`factura` AS `factura`,`bdfactura`.`fechaFactura` AS `fechaFactura`,`bdfactura`.`cliente` AS `clienteId`,`bdterceros`.`nombre` AS `nombre`,`bdfactura`.`vendedor` AS `vendedor`,`bdfactura`.`totalGeneral` AS `totalGeneral`,`bdfactura`.`terminal` AS `terminal`,`bdfactura`.`anulada` AS `anulada`,cast(substr(`bdfactura`.`idFactura`,6,100) as signed) AS `ordenId`,`bdfactura`.`turno` AS `turno`,`bdterceros`.`id` AS `cliente` from (`bdfactura` left join `bdterceros` on((`bdfactura`.`cliente` = `bdterceros`.`idSistema`))) group by `bdfactura`.`idFactura`,`bdfactura`.`factura`,`bdfactura`.`fechaFactura`,`bdfactura`.`cliente`,`bdterceros`.`nombre`,`bdfactura`.`vendedor`,`bdfactura`.`totalGeneral`,`bdfactura`.`terminal`,`bdfactura`.`anulada`,cast(substr(`bdfactura`.`idFactura`,6,100) as signed),`bdfactura`.`turno`,`bdterceros`.`id` order by cast(substr(`bdfactura`.`idFactura`,6,100) as signed)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick5`.`bdfactura`.`idFactura` AS `idFactura`,`bdclick5`.`bdfactura`.`factura` AS `factura`,`bdclick5`.`bdfactura`.`fechaFactura` AS `fechaFactura`,`bdclick5`.`bdfactura`.`cliente` AS `clienteId`,`bdclick5`.`bdterceros`.`nombre` AS `nombre`,`bdclick5`.`bdfactura`.`vendedor` AS `vendedor`,`bdclick5`.`bdfactura`.`totalGeneral` AS `totalGeneral`,`bdclick5`.`bdfactura`.`terminal` AS `terminal`,`bdclick5`.`bdfactura`.`anulada` AS `anulada`,cast(substr(`bdclick5`.`bdfactura`.`idFactura`,6,100) as signed) AS `ordenId`,`bdclick5`.`bdfactura`.`turno` AS `turno`,`bdclick5`.`bdterceros`.`id` AS `cliente` from (`bdclick5`.`bdfactura` left join `bdclick5`.`bdterceros` on((`bdclick5`.`bdfactura`.`cliente` = `bdclick5`.`bdterceros`.`idSistema`))) group by `bdclick5`.`bdfactura`.`idFactura`,`bdclick5`.`bdfactura`.`factura`,`bdclick5`.`bdfactura`.`fechaFactura`,`bdclick5`.`bdfactura`.`cliente`,`bdclick5`.`bdterceros`.`nombre`,`bdclick5`.`bdfactura`.`vendedor`,`bdclick5`.`bdfactura`.`totalGeneral`,`bdclick5`.`bdfactura`.`terminal`,`bdclick5`.`bdfactura`.`anulada`,cast(substr(`bdclick5`.`bdfactura`.`idFactura`,6,100) as signed),`bdclick5`.`bdfactura`.`turno`,`bdclick5`.`bdterceros`.`id` order by cast(substr(`bdclick5`.`bdfactura`.`idFactura`,6,100) as signed)
mariadb-version=100135